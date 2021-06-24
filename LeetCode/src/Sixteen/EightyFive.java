package Sixteen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class EightyFive {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int b[]=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            b[i]=nums[i];
        }

        for (int i = 0; i <b.length ; i++) {
            if (integerIntegerHashMap.containsKey(b[i]))
            {
                continue;
            }else
            {
                integerIntegerHashMap.put(b[i],i);
            }
        }
        int c[]=new int[nums.length+1];

        for (int i = 1; i <=nums.length ; i++) {
            c[i]=c[i-1]+b[i-1];
        }

        for (int i = 0; i <nums.length ; i++) {
            Integer integer = integerIntegerHashMap.get(nums[i]);
            if (integer>0)
            {
                b[i]=c[nums.length]-c[integer+1]-(nums.length-integer-1)*nums[i]-c[i]+(i)*nums[i];
            }else
            {
                b[i]=c[nums.length]-c[integer+1]-(nums.length-integer-1)*nums[i];
            }
        }
        return b;
    }
}

