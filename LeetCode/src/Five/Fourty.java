package Five;

public class Fourty {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s^nums[i];
        }
        return s;
    }
}