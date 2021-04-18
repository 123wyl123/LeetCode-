package FiveZero;

public class oNE {
    public int minOperations(int[] nums) {
        int temp =0;
        if (nums.length==0)
        {
            return 0;
        }
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]<nums[i+1])
            {
                continue;
            }else
            {
                temp=temp+nums[i]+1-nums[i+1];
                nums[i+1]=nums[i]+1;
            }
        }
        return temp;
    }
}
