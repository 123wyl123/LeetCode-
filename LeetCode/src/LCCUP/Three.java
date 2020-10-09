package LCCUP;

public class Three {
    public int minimumOperations(String leaves) {
        int length = leaves.length();
        int  dp[][] = new int[length][3];
      dp[0][0] = leaves.charAt(0)=='y'?1:0;
      dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;
        for (int i = 1; i <length ; i++) {
            int isyellow = leaves.charAt(i)=='y'?1:0;
            int isred = leaves.charAt(i)=='r'?1:0;
            dp[i][0] = dp[i-1][0]+isyellow;
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][1])+isred;
            if (i>=2)
            {
                dp[i][2] = Math.min(dp[i-1][1],dp[i-1][2])+isyellow;
            }
        }
        return dp[length-1][2];
    }
}

