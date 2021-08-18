package Five;

public class FiftyTwo {
    public int checkRecord(int n) {
    long dp[][]=new long[n+1][4];
        dp[0][0]=1;
        for (int i = 1; i <=n ; i++) {
           dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%1000000007;;
           dp[i][1]=dp[i-1][0]%1000000007;;
            dp[i][2]=dp[i-1][1]%1000000007;;
        }
        long sum = (dp[n][0]+dp[n][1]+dp[n][2])%1000000007;

        for (int i = 1; i <=n ; i++) {
            sum=sum+((dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%1000000007)*((dp[n-i][0]+dp[n-i][1]+dp[n-i][2])%1000000007)%1000000007;
        }
        return (int) (sum%1000000007);
    }

    public static void main(String[] args) {
        new FiftyTwo().checkRecord(3);
    }
}
