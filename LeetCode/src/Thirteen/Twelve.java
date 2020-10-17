package Thirteen;

public class Twelve {
    public int minInsertions(String s) {
        char[] chars = s.toCharArray();
        int dp[][] = new int[s.length()][s.length()];
        for (int j = 1; j <chars.length ; j++) {
            dp [j-1][j] = chars[j-1]==chars[j]?0:1;
            for (int  i = j-2; i >=0 ; i--) {
                if (chars[i]==chars[j])
                {
                    dp[i][j] = dp[i+1][j-1];
                }else
                {
                    dp[i][j] = Math.min(dp[i][j-1],dp[i+1][j])+1;
                }

            }
        }

        return dp[0][s.length()-1];
    }
}

