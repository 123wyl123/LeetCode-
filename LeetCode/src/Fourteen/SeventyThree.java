package Fourteen;

public class SeventyThree {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int dp[][][] = new int[houses.length][cost[0].length][target];
        if (houses[0]==0)
        {
            for (int i = 0; i <cost[0].length ; i++) {
                dp[0][i][0]=cost[0][i];
            }
        }else
        {
            dp[0][houses[0]-1][0]=cost[0][houses[0]-1];
        }

        for (int i = 1; i <dp.length ; i++) {
            if (houses[i]!=0)
            {
                int temp =Integer.MAX_VALUE;
                for (int j = 0; j <cost[0].length ; j++) {
                    for (int k = 0; k <target ; k++) {
                        if (k==0)
                        {
                            if (j!=(houses[i]-1))
                            {
                                continue;
                            }else if (dp[i-1][j][k]!=0)
                            {
                                dp[i][houses[i]-1][k] = dp[i-1][j][k]+cost[i][houses[i]-1];
                            }
                        }else
                        {
                            if (j!=(houses[i]-1))
                            {
                                if (dp[i-1][j][k-1]!=0)
                                {
                                   if (dp[i][houses[i]-1][k]!=0)
                                   {
                                       dp[i][houses[i]-1][k]=Math.min(dp[i][houses[i]-1][k],dp[i-1][j][k-1]+cost[i][houses[i]-1]);
                                   }else
                                   {
                                       dp[i][houses[i]-1][k]=dp[i-1][j][k-1]+cost[i][houses[i]-1];
                                   }
                                }
                            }else if (dp[i-1][j][k]!=0)
                            {   if (dp[i][houses[i]-1][k]!=0)
                            {
                                dp[i][houses[i]-1][k]=Math.min(dp[i-1][j][k]+cost[i][houses[i]-1],dp[i][houses[i]-1][k]);
                            }else
                            {
                                dp[i][houses[i]-1][k] = dp[i-1][j][k]+cost[i][houses[i]-1];
                            }

                            }

                        }
                    }
                }
                continue;
            }
            for (int j = 0; j <cost[0].length ; j++) {
                for (int k = 0; k <Math.min(target,i+1) ; k++) {
                  if (k==0)
                  {     if (dp[i-1][j][k]!=0)
                  {     if (dp[i][j][k]!=0)
                  {
                      dp[i][j][k]=Math.min(dp[i-1][j][k]+cost[i][j],dp[i][j][k]);
                  }else
                  {
                      dp[i][j][k]=dp[i-1][j][k]+cost[i][j];
                  }

                  }
                  }else
                  {
                      for (int l = 0; l <cost[0].length ; l++) {
                          if (l==j)
                          {     if (dp[i-1][j][k]!=0)
                          {     if (dp[i][j][k]==0)
                          {
                              dp[i][j][k] = dp[i-1][j][k]+cost[i][j];
                          }else
                          {
                              dp[i][j][k]=Math.min(dp[i][j][k],dp[i-1][j][k]+cost[i][j]);
                          }

                          }

                          }else
                          {     if (dp[i-1][l][k-1]!=0)
                          {
                              if (dp[i][j][k]==0)
                              {
                                  dp[i][j][k] = dp[i-1][l][k-1]+cost[i][j];
                              }else
                              {
                                  dp[i][j][k] =Math.min( dp[i-1][l][k-1]+cost[i][j],dp[i][j][k]);
                              }

                          }

                          }
                      }
                  }
                }
            }
        }
        int sum =Integer.MAX_VALUE;
        for (int i = 0; i<cost[0].length ; i++) {
            if (dp[houses.length-1][i][target-1]!=0)
            {
                sum=Math.min(dp[houses.length-1][i][target-1],sum);
            }
        }
        int temp =0;
        for (int i = 0; i <houses.length ; i++) {
            if (houses[i]!=0)
            {
                temp+=cost[i][houses[i]-1];
            }
        }
        return sum==Integer.MAX_VALUE?-1:sum-temp;
    }

    public static void main(String[] args) {
        int a[]={0,0,0,3};
        int b[][]={{2,2,5},{1,5,5},{5,1,2},{5,2,5 }};
        new SeventyThree().minCost(a,b,5,2,3);
    }
}
