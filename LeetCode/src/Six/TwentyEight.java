package Six;

import java.util.Arrays;

public class TwentyEight {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int length =nums.length-1;
        max = Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[length]*nums[length-1]*nums[length-2]);
        return max;
    }
}
