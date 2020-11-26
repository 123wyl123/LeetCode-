package One;

import java.util.Arrays;

public class SixtyFour {
    public int maximumGap(int[] nums) {
        int sum =0;
        int length = nums.length;
        if (length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i <length-1 ; i++) {
            sum = Math.max(sum,nums[i+1]-nums[i]);
        }
        return sum;
    }
    public int maximumGap1(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        long exp = 1;
        int[] buf = new int[n];
        int maxVal = Arrays.stream(nums).max().getAsInt();

        while (maxVal >= exp) {
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exp) % 10;
                cnt[digit]++;
            }
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) exp) % 10;
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }
            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;
        }

        int ret = 0;
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }
        return ret;
    }


    public static void main(String[] args) {
        int a[] = {3,6,9,1};
        new SixtyFour().maximumGap1(a);
    }
}
