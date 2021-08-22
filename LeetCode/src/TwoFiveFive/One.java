package TwoFiveFive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class One {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        return gcd(a,b);
    }
    public int gcd(int a,int b)
    {
        while (a!=0) {
            int temp = b % a;
            b = a;
            a = temp;
        }
        return b;
    }
}
