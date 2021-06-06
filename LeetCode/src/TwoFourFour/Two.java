package TwoFourFour;

import java.util.Arrays;
import java.util.HashSet;

public class Two {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> integers = new HashSet<>();
       int num = 0;
        for (int i =0 ; i <nums.length ; i++) {
            if (integers.contains(nums[i]))
            {   num+=integers.size()-1;
                continue;
            }else
            {   num+=integers.size();
                integers.add(nums[i]);
            }
        }
        return num;
    }
}
