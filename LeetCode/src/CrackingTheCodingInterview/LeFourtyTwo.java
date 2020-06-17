package CrackingTheCodingInterview;

public class LeFourtyTwo {
    public int maxSubArray(int[] nums) {
        int max = nums[0] ;
        int temp =0;
        for (int i=0;i<nums.length;i++)
        {
            temp = temp+nums[i];
            if(temp>max)
            {
                max = temp;
            }
        }
        return 0 ;
    }
}
