package Zero;

public class FiftyFive {
    public boolean canJump(int[] nums) {
        if (nums.length==0)
        {
            return false;
        }
        int l = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (l<i)
            {
                return false;
            }else
            {
                l = Math.max(l,i+nums[i]);
            }
        }
        return true;
    }
}
