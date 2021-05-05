package Seven;

import java.util.Arrays;

public class Fourty {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
    int dp[][] = new int[nums.length][2];
    dp[0][1]=nums[0];
    dp[0][0]=0;
    int max =Math.max(dp[0][1],dp[0][0]);
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]==nums[i-1])
            {
                dp[i][1]=dp[i-1][1]+nums[i];
                dp[i][0]=dp[i-1][0];
            }else if (nums[i]==nums[i-1]+1)
            {
                dp[i][1] = dp[i-1][0]+nums[i];
                dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            }else
            {
                dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0])+nums[i];
                dp[i][0] = Math.max(dp[i-1][1],dp[i-1][0]);
            }
            max =Math.max(max,Math.max(dp[i][1],dp[i][0]));
        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={2,2,3,3,3,4};
        new Fourty().deleteAndEarn(a);
    }
}
