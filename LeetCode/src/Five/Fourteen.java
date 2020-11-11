package Five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fourteen {
    int max;

    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        List<Integer>[] pos = new List[26];
        for (int i = 0; i < 26; ++i) {
            pos[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; ++i) {
            pos[ring.charAt(i) - 'a'].add(i);
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(dp[i], 0x3f3f3f);
        }
        for (int i : pos[key.charAt(0) - 'a']) {
            dp[0][i] = Math.min(i, n - i) + 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j : pos[key.charAt(i) - 'a']) {
                for (int k : pos[key.charAt(i - 1) - 'a']) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.min(Math.abs(j - k), n - Math.abs(j - k)) + 1);
                }
            }
        }
        return Arrays.stream(dp[m - 1]).min().getAsInt();

    }
    public int findRotateSteps1(String ring, String key) {
        if (ring == null) return 0;
        List<Integer>[] r = new List[26];
        for (int i = 0; i < 26; i++) {
            r[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < ring.length(); i++) {
            r[ring.charAt(i) - 'a'].add(i);
        }
        int[][] cache = new int[ring.length()][key.length()];
        return search(r, ring.length(), 0, key, 0, cache);
    }

    private int search(List<Integer>[] ring, int len, int p, String key, int index, int[][] cache) {
        if (index == key.length()) return 0;
        if (cache[p][index] > 0) return cache[p][index];
        char c = key.charAt(index);
        List<Integer> indices = ring[c - 'a'];
        int min = Integer.MAX_VALUE;
        for (int i: indices) {
            int oneDir = Math.abs(p - i);
            int otherDir = len - oneDir;
            min = Math.min(min, 1 + Math.min(oneDir, otherDir) + search(ring, len, i, key, index + 1, cache));
        }
        cache[p][index] = min;
        return min;

    }

}
