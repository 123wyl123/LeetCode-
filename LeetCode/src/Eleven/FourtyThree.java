package Eleven;

public class FourtyThree {
    public int longestCommonSubsequence(String text1, String text2) {
        int length = text1.length();
        int length1 = text2.length();
        int dp[][] = new int[length][length1];
        dp[0][0] = text1.charAt(0)==text2.charAt(0)?1:0;
        for (int i =1; i <length ; i++) {
            dp[i][0] = Math.max(dp[i-1][0],text1.charAt(i)==text2.charAt(0)?1:0);
        }
        for (int i = 1; i <length1 ; i++) {
            dp[0][i] = Math.max(dp[0][i-1],text2.charAt(i)==text1.charAt(0)?1:0);
        }
        for (int i = 1; i <length ; i++) {
            for (int j = 1; j <length1 ; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                if (text1.charAt(i)==text2.charAt(j))
                {
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+1);
                }
            }
        }
        return dp[length-1][length1-1];
    }
}
