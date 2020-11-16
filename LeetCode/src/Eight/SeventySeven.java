package Eight;

public class SeventySeven {
    public boolean stoneGame(int[] piles) {
        int dp[][] =  new int[piles.length][piles.length];
        boolean flag = true;
        int length = piles.length;
        for (int i = 0; i <length-1 ; i++) {
            dp[i][i+1] = Math.abs(piles[i]-piles[i+1]);
            dp[i][i] = piles[i];
        }
        dp[length-1][length-1] =piles[length-1];
        for (int i = 3; i <=length ; i++) {
            for (int j = 0; j <=length-i ; j++) {
                int m = j+i-1;
                dp[j][m] =Math.max(dp[j][j]-dp[j+1][m],dp[m][m]-dp[j][m-1]);
            }
        }

        return dp[0][length-1]>0?true:false;
    }


}
