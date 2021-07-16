package Sword;

public class FiftyThree {
    public int search(int[] nums, int target) {
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                sum++;
            }
        }
        return sum;
    }
}