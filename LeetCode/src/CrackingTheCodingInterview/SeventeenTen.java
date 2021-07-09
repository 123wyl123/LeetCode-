package CrackingTheCodingInterview;

import java.util.HashMap;

public class SeventeenTen {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int max =-1;
        for (int i = 0; i < nums.length; i++) {
            integerIntegerHashMap.put(nums[i],integerIntegerHashMap.getOrDefault(nums[i],0)+1);
           if (max==-1)
           {
               max =i;
           }else if(integerIntegerHashMap.get(nums[max])<integerIntegerHashMap.get(nums[i]))
           {
               max =i;
           }
        }
        if (integerIntegerHashMap.get(nums[max])>nums.length/2)
        {
            return max;
        }
        return -1;
    }
}
