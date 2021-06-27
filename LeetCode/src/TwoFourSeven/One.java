package TwoFourSeven;

import java.util.Arrays;

public class One {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        long temp =0;
        temp=nums[nums.length-1]*nums[nums.length-2];
        long temp1 =0;
        temp1=nums[0]*nums[1];
        return (int)(temp-temp1);
    }

    public static void main(String[] args) {
        int a[]= {5,6,2,7,4};
        new One().maxProductDifference(a);
    }
}
