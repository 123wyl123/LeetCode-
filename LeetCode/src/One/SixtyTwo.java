package One;

public class SixtyTwo {
    public int findPeakElement(int[] nums) {

        for(int i=1;i<nums.length;i++)
        {   if(i==nums.length-1)
        {if(nums[i]>nums[i-1])
        {
            return i;
        }else
        {
            return 0;
        }
        }
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
            {
                return i;
            }
        }
        return 0;
    }
}