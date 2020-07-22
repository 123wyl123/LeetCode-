package One;

public class FiftyFour {
    public int findMin(int[] nums) {
        int i =0;
        int j=nums.length-1;
        if(nums[i]<nums[j])
        {
            return nums[i];
        }
        while (i<j)
        {
            if(nums[i]>=nums[j])
            {
                int mid = (i+j+1)/2;
                if(nums[mid]<nums[j])
                {
                    j = mid;
                } else if(nums[mid]>nums[j])
                {
                    i =mid;
                } else
                {
                    i++;
                }
                if(j-i==1)
                {
                    return nums[j];
                }
            } else
            {
                return nums[i];
            }


        }
        return nums[i];
    }
}
