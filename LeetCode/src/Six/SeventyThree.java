package Six;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SeventyThree {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length+1];
        int max =1;
        HashMap<Integer, HashMap<Integer, Integer>> integerHashMapHashMap = new HashMap<>();
        for (int i = 1; i <=nums.length ; i++) {
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
            integerIntegerHashMap.put(1,1);
            integerHashMapHashMap.put(i,integerIntegerHashMap);
        }
        Arrays.fill(dp,1);
        for (int i = 1; i <=nums.length ; i++) {
            for (int j = i; j <=nums.length ; j++) {
                if (nums[j-1]>nums[i-1]&&dp[i]+1>=dp[j])
                {
                    dp[j]=Math.max(dp[i]+1,dp[j]);
                    max =Math.max(max,dp[j]);
                    HashMap<Integer, Integer> G = integerHashMapHashMap.get(j);
                    G.put(dp[j],G.getOrDefault(dp[j],0)+integerHashMapHashMap.get(i).getOrDefault(dp[i],0));
                }
            }
        }
        if (max==1)
        {
            return nums.length;
        }

        int sum=0;
        for (Integer integer : integerHashMapHashMap.keySet()) {
            HashMap<Integer, Integer> integerIntegerHashMap = integerHashMapHashMap.get(integer);
            for (Integer integer1 : integerIntegerHashMap.keySet()) {
                if (integer1==max)
                {
                    sum+=integerIntegerHashMap.get(integer1);
                }
            }
        }
        return sum;

    }

}