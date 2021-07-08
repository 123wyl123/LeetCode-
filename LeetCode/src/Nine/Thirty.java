package Nine;

import java.util.HashMap;

public class Thirty {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int a[]=new int[nums.length+1];
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put(0,1);
        int sum =0;
        for (int i = 0; i <nums.length ; i++) {
            a[i+1]=nums[i]+a[i];
            if (integerIntegerHashMap.containsKey(goal-a[i+1]))
            {
              sum+=  integerIntegerHashMap.get(goal-a[i+1]);

            }
            integerIntegerHashMap.put(a[i+1],integerIntegerHashMap.getOrDefault(a[i+1],0)+1);
        }
        return sum;
    }
}
