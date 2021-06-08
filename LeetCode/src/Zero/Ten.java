package Zero;

public class Ten {
    public static boolean isValid(char[] str, char[] pattern) {
        for (char cha : str) {
            if (cha == '.' || cha == '*') {
                return false;
            }
        }
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == '*' && (i == 0 || pattern[i - 1] == '*')) {
                return false;
            }
        }
        return true;
    }

    public boolean isMatch(String s, String p) {
        if (s== null || p == null) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();
        if (!isValid(s1, p1)) {
            return false;
        }
        int N = s1.length;
        int M = p1.length;
        boolean[][] dp = new boolean[N + 1][M + 1];
        dp[N][M] = true;
        for (int j = M - 1; j >= 0; j--) {
            dp[N][j] = (j + 1 < M && p1[j + 1] == '*') && dp[N][j + 2];
        }
        if (N > 0 && M > 0) {
            dp[N - 1][M - 1] = (s1[N - 1] == p1[M - 1] || p1[M - 1] == '.');
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = M - 2; j >= 0; j--) {
                if (p1[j + 1] != '*') {
                    dp[i][j] = ((s1[i] == p1[j]) || (p1[j] == '.')) && dp[i + 1][j + 1];
                } else {
                    if ((s1[i] == p1[j] || p1[j] == '.') && dp[i + 1][j]) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i][j + 2];
                    }
                }
            }
        }
        return dp[0][0];

    }

    public static void main(String[] args) {
        new Ten().isMatch("aab",".*");
    }
}
