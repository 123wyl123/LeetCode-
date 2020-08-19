package Six;

public class FourtySeven {
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;


    }

    public int countSubstrings1(String s) {
        int n = s.length();
        boolean a[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = true;
        }
        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j <= n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        a[i][j] = true;
                    } else {
                        a[i][j] = a[i + 1][j - 1];
                    }

                } else {
                    a[i][j] = false;
                }
                if (a[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
