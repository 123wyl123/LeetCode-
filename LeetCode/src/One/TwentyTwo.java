package One;

public class TwentyTwo {
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        dp[0][1] = -prices[0];
        dp[0][0]=0;
        int max = 0;
        for (int i = 1; i <prices.length ; i++) {
           dp[i][0] = Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
           dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
           max = Math.max(max,Math.max(dp[i][0],dp[i][1]));
        }
       return max;
    }

    public static void main(String[] args) {
        int a[] ={7,1,5,3,6,3};
        new TwentyTwo().maxProfit(a);
    }
}
