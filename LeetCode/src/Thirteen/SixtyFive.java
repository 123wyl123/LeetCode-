package Thirteen;

import java.util.Arrays;
import java.util.HashMap;

public class SixtyFive {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int a[] = new int[length];
        System.arraycopy(nums,0,a,0,length);
        Arrays.sort(nums);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <length ; i++) {
            if (integerIntegerHashMap.containsKey(nums[i]))
            {
                continue;
            }else
            {
                integerIntegerHashMap.put(nums[i],i);
            }
        }
        for (int i = 0; i <length ; i++) {
            a[i] = integerIntegerHashMap.get(a[i]);
        }
        return a;

    }
}
