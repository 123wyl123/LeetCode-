package TwoZeroThree;

public class Four {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + stoneValue[i - 1];
        }
        int f[][] = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int j = i + len - 1;

                for (int k = i; k < j; k++) {
                    int left = get(i, k, s);
                    int right = get(k + 1, j, s);
                    if (left < right) {
                        if (f[i][j] < left + f[i][k]) {
                            f[i][j] = left + f[i][k];
                        }
                    } else if (left > right) {
                        if (f[i][j] < right + f[k + 1][j]) {
                            f[i][j] = right + f[k + 1][j];
                        }
                    } else {
                        if (f[i][j] < left + Math.max(f[i][k], f[k + 1][j])) {
                            f[i][j] = left + Math.max(f[i][k], f[k + 1][j]);
                        }
                    }
                }
            }
        }
        return f[1][n];
    }

    public int get(int l, int r, int[] arr) {
        return arr[r] - arr[l - 1];
    }

    public int stoneGameV1(int[] stoneValue) {
        int N = stoneValue.length;

        // cache prefix
        int[] prefix = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        return helper(stoneValue, 0, N - 1, prefix, new Integer[N][N]);
    }

    private int helper(int[] stoneValue, int l, int r, int[] prefix, Integer[][] dp) {

        if (l == r) return 0;
        if (l + 1 == r) return Math.min(stoneValue[l], stoneValue[r]);

        if (dp[l][r] != null) return dp[l][r];

        int res = 0;

        // left: [l, i], right: [i + 1, r]
        for (int i = l; i < r; ++i) {

            int left = prefix[i + 1] - prefix[l];
            int right = prefix[r + 1] - prefix[i + 1];

            if (left > right) {  // go right
                res = Math.max(res, right + helper(stoneValue, i + 1, r, prefix, dp));
            } else if (left < right) {  // go left
                res = Math.max(res, left + helper(stoneValue, l, i, prefix, dp));
            } else {  // left == right: go whatever max
                res = Math.max(res, Math.max(helper(stoneValue, l, i, prefix, dp),
                        helper(stoneValue, i + 1, r, prefix, dp))
                        + left);
            }

        }

        return dp[l][r] = res;
    }

}
