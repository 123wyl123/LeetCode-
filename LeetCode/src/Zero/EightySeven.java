package Zero;

public class EightySeven {
    public boolean isScramble(String s1, String s2) {
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        boolean dp[][][] = new boolean[chars.length][chars.length][chars.length];
        for (int i = 0; i <chars.length ; i++) {
            for (int j = 0; j <chars.length ; j++) {
                if (chars[i]==chars1[j])
                {
                    dp[i][i][j] = true;
                }
            }
        }
        for (int i = 1; i <chars.length ; i++) {
            for (int j = 0; j <chars.length-i ; j++) {
                for (int k = 0; k <chars.length-i; k++) {
                    for (int l = k; l <k+i ; l++) {
                        if (dp[j][j+i][k])
                        {
                            break;
                        }
                       dp[j][j+i][k]=dp[j][j+i][k]||(dp[j][l-k+j][k]&&dp[l-k+j+1][j+i][l+1]||dp[j][l-k+j][2*k+i-l]&&dp[l-k+j+1][j+i][k]);
                    }

                }
            }
        }
        return dp[0][chars.length-1][0];
    }

    public static void main(String[] args) {
       new EightySeven().isScramble("abcdbdacbdac"
             ,  "bdacabcdbdac");
    }
}
