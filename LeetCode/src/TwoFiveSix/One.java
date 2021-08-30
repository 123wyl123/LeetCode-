package TwoFiveSix;

import java.util.Arrays;

public class One {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=l+k-1;
        int min =Integer.MAX_VALUE;
        while (r<nums.length)
        {
            min=Math.min(nums[r]-nums[l],min);
            l++;
            r++;
        }
        return min;
    }
}