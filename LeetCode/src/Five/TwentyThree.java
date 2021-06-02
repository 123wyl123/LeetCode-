package Five;

import java.util.HashMap;

public class TwentyThree {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put(0,-1);
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
                sum=sum%k;
                if (integerIntegerHashMap.containsKey(sum))
                {
                    Integer integer = integerIntegerHashMap.get( sum);
                    if (i-integer>=2)
                    {
                        return true;
                    }
                }else
                {
                    integerIntegerHashMap.put(sum,i);
                }

        }
        return false;
    }
}
