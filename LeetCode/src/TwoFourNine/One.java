package TwoFourNine;

public class One {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        int length = nums.length;
        for (int i = 0; i <length ; i++) {
            a[i]=nums[i];
            a[i+length]=nums[i];
        }
        return a;
    }
}
