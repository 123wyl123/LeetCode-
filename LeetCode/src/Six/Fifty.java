package Six;

import java.util.Arrays;

public class Fifty {
    public int minSteps(int n) {

    if (n==1)
    {
        return 0;
    }else if (n==2)
    {
        return 2;
    }else if (n==3)
    {
        return 3;
    }
    int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[1]=0;
        dp[2]=2;
        dp[3]=3;
        for (int i = 4; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                if (i%j==0)
                {
                    dp[i]=Math.min(dp[i],dp[j]+i/j);
                }
            }
        }
        return dp[n]==Integer.MAX_VALUE?n:dp[n];
    }

}
