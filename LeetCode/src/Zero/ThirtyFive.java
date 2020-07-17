package Zero;

public class ThirtyFive {
    public int searchInsert(int[] nums, int target) {
        int j = nums.length-1;
        int i =0;
        int mid = (i+j)/2;
        while (i<j)
        {
            if(nums[mid]<target)
            {
                i=mid+1;
                mid=(i+j)/2;
            }
            else if(nums[mid]==target)
            {
                return mid;
            }
            else
            {
                j=mid-1;
                mid=(i+j)/2;
            }
        }
        if(nums[i]<target)
        {
            return i+1;
        }
        else
        {
            return i;
        }

    }
}
