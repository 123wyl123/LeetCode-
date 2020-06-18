package CrackingTheCodingInterview;

public class SixTeenSevenTeen {
    public int maxSubArray(int[] nums) {
        int[] a = new int[nums.length];
        int max = nums[0];
        a[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (a[i - 1] > 0) {
                a[i] = a[i - 1] + nums[i];

            }
            else
            {
                a[i] = nums[i];
            }

            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
}
