package Seven;

public class Four {
    public int search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        while(l<r)
        {
            int mid = (l+r)/2;
            if(nums[mid]>=target)
            {
                r=mid;
            }else
            {
                l=mid+1;
            }

        }
        if(nums[l]==target)
        {
            return l;
        }
        return -1;
    }
}