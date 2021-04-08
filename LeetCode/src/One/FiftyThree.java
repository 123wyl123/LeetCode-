package One;

import java.util.Arrays;

public class FiftyThree {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums.length==0?0:nums[0];
    }
}
