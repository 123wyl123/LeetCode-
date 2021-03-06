package Four;

public class Ten {


    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
            if (left < nums[i]) {
                left = nums[i];
            }
        }
        while (left < right) {
            int mid = (right - left)/ 2 + left;
            if (search(nums, mid, m)) {

                right=mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean search(int[] nums, int max, int m) {
        int count = 0;
        int res = 1;

        for (int i = 0; i < nums.length; i++) {
            if (count+ nums[i] > max) {
                res++;
                count = nums[i];
            } else {
              count += nums[i];
            }
        }
        return res<=m;
    }


}

