package One;

public class EightyEight {
    public int maxProfit(int k, int[] prices) {
        if (prices.length<2)
        {
            return 0;
        }
        int length = prices.length;
        int dp[][][] = new int[length][2][k+1];


        int max =0;
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <2 ; j++) {
                for (int l = 0; l <=k ; l++) {
                    dp[i][j][l] = -10000005;
                }
            }
        }
        dp[0][0][0] =0;
        dp[0][1][0] = -prices[0];
        for (int i = 1; i <length ; i++) {
            dp[i][0][0] = 0;
            dp[i][1][0] = Math.max(dp[i-1][1][0],-prices[i]);
            for (int j = 1; j <=k ; j++) {

                dp[i][0][j]= Math.max(dp[i-1][1][j-1]+prices[i],dp[i-1][0][j]);
                dp[i][1][j] = Math.max(dp[i-1][1][j],dp[i-1][0][j]-prices[i]);
                int temp = Math.max(dp[i][0][j],dp[i][1][j]);
                max = Math.max(temp,max);
            }
        }
     return max;
    }

    public static void main(String[] args) {
        int a[]= {3,2,6,5,0,3};
        int i = new EightyEight().maxProfit(2, a);
        System.out.println(i);
    }
}
