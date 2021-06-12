package Two;

public class SeventyNine {
    public int numSquares(int n) {

        int k = (int)(Math.sqrt(n))+1;
        int[] a = new int[k];
        int dp[] = new int[n+1];
        for (int i = 0; i <k ; i++) {
            a[i] = i*i;
        }
        for (int i = 0; i <n+1 ; i++) {
            dp[i]  =Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <k ; i++) {
            for (int j=a[i]; j<=n ; j++) {
                dp[j]= Math.min(dp[j],dp[j-a[i]]+1);
            }
        }

    return dp[n];

    }



    public static void main(String[] args) {
        new SeventyNine().numSquares(12);
    }
}
