package BiweeklyFiftyFour;

public class Four {
    public int minOperationsToFlip(String expression) {
        char[] chars = expression.toCharArray();
        int dp[][][]=new int[expression.length()][expression.length()][2];

        for (int i = 0; i <expression.length() ; i++) {
            for (int j = 0; j <expression.length() ; j++) {
                for (int k = 0; k <2 ; k++) {
                    dp[i][j][k]=Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='0')
            {
                dp[i][i][0]=0;
                dp[i][i][1]=1;
            }else if(chars[i]=='1')
            {
                dp[i][i][0]=1;
                dp[i][i][1]=0;
            }else
            {
                dp[i][i][0]=Integer.MAX_VALUE;
                dp[i][i][1]=Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i <expression.length() ; i++) {
            for (int j = 0; j <expression.length()-i ; j++) {

                int temp=0;
            if (i==expression.length()-1)
            {
                System.out.println();
            }
                for (int k = j; k <=j+i ; k++) {
                    if (chars[k]=='(')
                    {
                        temp++;
                    }else if(chars[k]==')')
                    {
                        temp--;
                    }

                    if (chars[j]=='('&&chars[k]==')'&&temp==0)
                    {
                        dp[j][k]=dp[j+1][k-1];
                    }else if (chars[j]=='0'||chars[j]=='1'||chars[j]=='(')
                    {
                        if (chars[k]=='|')
                        {
                            dp[j][i+j][1]=Math.min(Math.min(dp[j][k-1][1]+dp[k+1][j+i][0],dp[j][k-1][0]+dp[k+1][j+i][1]),dp[j][j+i][1]);
                            dp[j][j+i][0]=Math.min(Math.min(dp[j][k-1][0]+dp[k+1][j+i][0],dp[j][k-1][1]+dp[k+1][j+i][1]),dp[j][j+i][0]);
                            dp[j][j+i][1]=Math.min(dp[j][k-1][1]+dp[k+1][j+i][1]+1,dp[j][j+i][1]);
                            dp[j][j+i][0]=Math.min(Math.min(Math.min(dp[j][k-1][0]+dp[k+1][j+i][0],dp[j][k-1][1]+dp[k+1][j+i][0]),dp[j][k-1][0]+dp[k+1][j+i][1])+1,dp[j][j+i][0]);

                        }else if (chars[k]=='&')
                        {
                            dp[j][j+i][1]=Math.min(dp[j][k-1][1]+dp[k+1][j+i][1],dp[j][j+i][1]);
                            dp[j][i+j][1]=Math.min(Math.min(dp[j][k-1][1]+dp[k+1][j+i][0],dp[j][k-1][0]+dp[k+1][j+i][1])+1,dp[j][j+i][1]);

                            dp[j][i+j][0]=Math.min(Math.min(dp[j][k-1][1]+dp[k+1][i+j][0],dp[j][k-1][0]+dp[k+1][i+j][1]),dp[j][i+j][0]);
                            dp[j][i+j][0]=Math.min(dp[j][j+i][0],dp[j][k-1][0]+dp[k+1][i+j][0]);
                            dp[j][j+i][0]=Math.min(Math.min(dp[j][k-1][0]+dp[k+1][j+i][0],dp[j][k-1][1]+dp[k+1][j+i][1])+1,dp[j][j+i][0]);
                        }
                    }
                    if (dp[j][j+i][1]<0)
                    {
                        dp[j][j+i][1]=Integer.MAX_VALUE;
                    }
                    if (dp[j][j+i][0]<0)
                    {
                    dp[j][j+i][0]=Integer.MAX_VALUE;
                    }
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        new Four().minOperationsToFlip( "(0&0)&(0&0&0)");
    }
}
