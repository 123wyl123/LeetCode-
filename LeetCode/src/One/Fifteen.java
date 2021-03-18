package One;

public class Fifteen {
    public int numDistinct(String s, String t) {

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int length = s.length();
        int length1 = t.length();
            if (length<length1)
            {
                return 0;
            }
        int dp[][] = new int[length][length1];

        dp[0][0] = chars[0]==chars1[0]?1:0;

        for (int i = 1; i <length ; i++) {
            for (int j = 0; j <length1 ; j++) {
                if (chars[i]==chars1[j])
                {
                    if (j-1>=0)
                    {
                        dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                    }else
                    {
                        dp[i][j]=dp[i-1][j]+1;
                    }
                }else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[chars.length-1][length1-1];
    }

    public static void main(String[] args) {
        int i = new Fifteen().numDistinct("babgbag"
                , "bag");
        System.out.println(i);
    }
}
