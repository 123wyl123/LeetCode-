package Two;

public class ThirtyEight {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = length; i >0 ; i--) {
            for (int j = 0; j <i-1 ; j++) {
                if (nums[j]==0)
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }else
                {
                    continue;
                }
            }
        }
        return;
    }
}
