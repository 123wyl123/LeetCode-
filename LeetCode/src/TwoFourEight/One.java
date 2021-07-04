package TwoFourEight;

public class One {
    public int[] buildArray(int[] nums) {
        int a[]=new int[nums.length];
        int l=0;
        for (int i = 0; i <nums.length ; i++) {
            a[i]=nums[nums[i]];
        }
        return a;
    }
}
