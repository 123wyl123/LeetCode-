package Nineteen;

import java.util.Arrays;

public class EightyThree {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int max=Integer.MAX_VALUE;
        while (l+k-1<nums.length)
        {
            max=Math.min(max,nums[l+k-1]-nums[l]);
            l++;
        }
        return max;
    }
}