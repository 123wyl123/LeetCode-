package One;

import java.util.HashMap;

public class ThirtySeven {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            integerIntegerHashMap.put(nums[i],integerIntegerHashMap.getOrDefault(nums[i],0)+1);
        }
        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integerIntegerHashMap.get(integer)==1)
            {
                return integer;
            }
        }
        return 0;
    }
}
