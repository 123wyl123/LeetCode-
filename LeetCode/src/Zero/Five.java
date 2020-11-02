package Zero;

public class Five {
    public String longestPalindrome(String s) {
        if (s.length()==0)
        {
            return "";
        }
        int dp[][] =  new int[s.length()][s.length()];
        for (int i = 0; i <s.length() ; i++) {
            dp[i][i]= 1;
        }
        char[] chars = s.toCharArray();
        int max =1;
        for (int i = 1; i <s.length() ; i++) {
            dp[i-1][i] = chars[i-1]==chars[i]?2:0;
            max = Math.max(max,dp[i-1][i]);
            for (int j =i-2 ; j >=0; j--) {
                if (chars[j]==chars[i]&&dp[j+1][i-1]!=0)
                {
                    dp[j][i] = dp[j+1][i-1]+2;
                    max = Math.max(max,dp[j][i]);
                }

            }
        }


        for (int i = 0; i <s.length() ; i++) {
            for (int j = i; j <s.length() ; j++) {
                if (dp[i][j]==max)
                {

                    return s.substring(i,j+1);
                }
            }
        }

        return "";
    }


}
