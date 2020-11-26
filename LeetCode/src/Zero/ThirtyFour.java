package Zero;

public class ThirtyFour {
    public int[] searchRange(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        while (l<r)
        {
            int mid = (r+l)/2;
            if (nums[mid]>target)
            {
                r= mid-1;
            }else if (nums[mid]<target)
            {
                l=mid+1;
            }else
            {
                if (nums[l]<target)
                {
                    l++;
                }else if (nums[r]>target)
                {
                    r--;
                }else if (nums[l]==nums[r])
                {
                    break;
                }
            }
        }
        if (l>=0&&r>=0&&nums[r]==target&&nums[l]==target)
        {
            return  new int[]{l,r};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int a[] ={5,7,7,8,10};
        new ThirtyFour().searchRange(a,6);
    }
}
