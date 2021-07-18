package TwoFiveZero;

import com.sun.tools.javac.Main;

public class Three {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n= points[0].length;
        long dp[][]=new long[m][n];
        for (int i = 0; i <n ; i++) {
            dp[0][i]=points[0][i];
        }
        for (int i = 1; i <m ; i++) {
            long maxr =0;
            int maxri =0;
            for (int j = 0; j <n ; j++) {
                if (dp[i-1][j]-j>=maxr)
                {
                    maxr=dp[i-1][j]-j;
                    maxri=j;
                }
            }
            dp[i][0]=points[i][0]+maxr;
            long  maxl =dp[i-1][0]-1;
            int   maxli=0;
            int j=1;
            while (j<n) {




                for ( j =j ; j <= maxri; j++) {

                    if (dp[i - 1][maxri] - Math.abs(j - maxri) > dp[i - 1][maxli] - Math.abs(j - maxli)) {
                        dp[i][j] = dp[i - 1][maxri] + points[i][j]-Math.abs(maxri-j);
                    }else
                    {
                        dp[i][j] = dp[i - 1][maxli]-Math.abs(maxli-j) + points[i][j];
                    }
                    if (dp[i-1][j]>=dp[i-1][maxli]-Math.abs(maxli-j))
                    {
                        maxl=dp[i-1][j];
                        maxli=j;

                    }

                }
                if (maxri<j&&j<n)
                {
                    maxri=j;
                }


                maxri= dfs(dp[i-1],maxri,n);

            }
        }
        long maa =0;
        for (int i = 0; i <n ; i++) {
            maa=Math.max(maa,dp[m-1][i]);
        }
        return maa;
    }

    public int dfs(long dp[],int  start,int end)
    {
        int maxi=start;
        long max = dp[start];
        for (int i = start; i <end ; i++) {
            if (dp[i]-Math.abs(i-start)>max)
            {
                max=dp[i]-Math.abs(i-start);
                maxi=i;
            }
        }
        return maxi;
    }
}


