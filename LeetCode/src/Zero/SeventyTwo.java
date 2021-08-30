package Zero;

public class SeventyTwo {
    public int minDistance(String word1, String word2) {
        if (word1.length()==0||word2.length()==0)
        {
            return Math.max(word1.length(),word2.length());
        }
        char[] chars = word1.toCharArray();
        char[] chars1 = word2.toCharArray();
        int dp[][]=new int[chars.length][chars1.length];
        dp[0][0]=chars[0]==chars1[0]?0:1;
        for (int i = 1; i <chars1.length ; i++) {
          dp[0][i]=chars[0]==chars1[i]?i:dp[0][i-1]+1;
        }
        for (int i = 1; i <chars.length ; i++) {
            dp[i][0]=chars[i]==chars1[0]?i:dp[i-1][0]+1;
        }

        for (int i = 1; i <chars.length ; i++) {
            for (int j = 1; j < chars1.length ; j++) {
                    dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i <chars.length ; i++) {
            for (int j = 1; j <chars1.length ; j++) {
                if (chars[i]==chars1[j])
                {
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]);
                }else   if (dp[i-1][j-1]!=Integer.MAX_VALUE)
                {
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]+1);
                }
                    dp[i][j]=Math.min(dp[i][j],Math.min(dp[i][j-1]+1,dp[i-1][j]+1));

            }
        }
        return dp[chars.length-1][chars1.length-1];
    }

    public static void main(String[] args) {
        new SeventyTwo().minDistance("intention"
                ,"execution");
    }
}
