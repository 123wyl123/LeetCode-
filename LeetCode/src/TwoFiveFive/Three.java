package TwoFiveFive;

public class Three {
    public int minimizeTheDifference(int[][] mat, int target) {
        boolean dp[][]=new boolean[mat.length][5000];
        for (int i = 0; i <mat[0].length ; i++) {
            dp[0][mat[0][i]]=true;
        }
        for (int i = 1; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {

                for (int k = mat[i][j]; k <5000 ; k++) {
                    dp[i][k]=dp[i-1][k-mat[i][j]]||dp[i][k];
                }
            }
        }
        int min =Integer.MAX_VALUE;
        for (int i = 0; i <5000 ; i++) {
            if (dp[mat.length-1][i])
            {
                min=Math.min(Math.abs(target-i),min);
            }
        }
        return min;
    }
}
