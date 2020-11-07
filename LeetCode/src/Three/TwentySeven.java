package Three;

public class TwentySeven {
    public int countRangeSum1(int[] nums, int lower, int upper) {
        long s = 0;
        long[] sum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            s += nums[i];
            sum[i + 1] = s;
        }
        return countRangeSumRecursive(sum, lower, upper, 0, sum.length - 1);
    }

    public int countRangeSumRecursive(long[] sum, int lower, int upper, int left, int right) {
        if (left == right) {
            return 0;
        } else {
            int mid = (left + right) / 2;
            int n1 = countRangeSumRecursive(sum, lower, upper, left, mid);
            int n2 = countRangeSumRecursive(sum, lower, upper, mid + 1, right);
            int ret = n1 + n2;

            // 首先统计下标对的数量
            int i = left;
            int l = mid + 1;
            int r = mid + 1;
            while (i <= mid) {
                while (l <= right && sum[l] - sum[i] < lower) {
                    l++;
                }
                while (r <= right && sum[r] - sum[i] <= upper) {
                    r++;
                }
                ret += r - l;
                i++;
            }

            // 随后合并两个排序数组
            int[] sorted = new int[right - left + 1];
            int p1 = left, p2 = mid + 1;
            int p = 0;
            while (p1 <= mid || p2 <= right) {
                if (p1 > mid) {
                    sorted[p++] = (int) sum[p2++];
                } else if (p2 > right) {
                    sorted[p++] = (int) sum[p1++];
                } else {
                    if (sum[p1] < sum[p2]) {
                        sorted[p++] = (int) sum[p1++];
                    } else {
                        sorted[p++] = (int) sum[p2++];
                    }
                }
            }
            for (int j = 0; j < sorted.length; j++) {
                sum[left + j] = sorted[j];
            }
            return ret;
        }
    }


    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums.length==0)
        {
            return 0;
        }
       long arr[] =  new long[nums.length];
        int k=0;
        arr[0] = nums[0];
        if (arr[0]>=lower&&arr[0]<=upper)
        {
            k++;
        }
        for (int i = 1; i <nums.length ; i++) {
            arr[i]=arr[i-1]+nums[i];
            if (arr[i]>=lower&&arr[i]<=upper)
            {
                k++;
            }
        }
        for (int i = 0; i <nums.length -1; i++) {
            for (int j = i+1; j <nums.length ; j++) {

                if (arr[j]-arr[i]>=lower&&arr[j]-arr[i]<=upper)
                {
                    k++;
                }
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int a[] ={-2,5,-1};
        new TwentySeven().countRangeSum(a,-2,2);
    }
}
