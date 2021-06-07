package TwoFourFour;

public class Three {
    public int minFlips(String s) {
        int n = s.length();
        int[][] l = new int[n][2];

        int ans = 0;

        l[0][0] = (s.charAt(0) == '0') ? 0 : 1;
        l[0][1] = (s.charAt(0) == '1') ? 0 : 1;
        for (int i = 1; i < s.length(); i++) {
            l[i][0] = ((s.charAt(i) == '0') ? 0 : 1) + l[i - 1][1];
            l[i][1] = ((s.charAt(i) == '1') ? 0 : 1) + l[i - 1][0];
        }

        int[][] r = new int[n][2];
        r[n - 1][0] = (s.charAt(n - 1) == '0') ? 0 : 1;
        r[n - 1][1] = (s.charAt(n - 1) == '1') ? 0 : 1;
        for (int i = n - 2; i >= 0; i--) {
            r[i][0] = ((s.charAt(i) == '0') ? 0 : 1) + r[i + 1][1];
            r[i][1] = ((s.charAt(i) == '1') ? 0 : 1) + r[i + 1][0];
        }

        ans = Math.min(l[n - 1][0], l[n - 1][1]);
        for (int i = 1; i < n; i++) {
            if ((n - i) % 2 == 0) {
                // 0101 0101 ? 1010 1010
                ans = Math.min(ans, r[i][0] + ((i % 2 == 0) ? l[i - 1][1] : l[i - 1][0]));
                ans = Math.min(ans, r[i][1] + ((i % 2 == 0) ? l[i - 1][0] : l[i - 1][1]));
            } else {
                // 101 0101
                ans = Math.min(ans, r[i][0] + ((i % 2 == 0) ? l[i - 1][0] : l[i - 1][1]));
                ans = Math.min(ans, r[i][1] + ((i % 2 == 0) ? l[i - 1][1] : l[i - 1][0]));
            }
        }

        return ans;
    }
    public int minFlips1(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                sb1.append('1');
                sb2.append('0');
            } else {
                sb1.append('0');
                sb2.append('1');
            }
        }
        // construct two alternating strings
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        // double the input string
        s += s;
        int ans1 = 0;
        int ans2 = 0;
        int ans = n;
        // use sliding window to compare
        for (int i = 0; i < 2 * n; i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                ans1++;
            }
            if (s.charAt(i) != s2.charAt(i)) {
                ans2++;
            }
            if (i >= n) {   // left-most char is getting out of the sliding window
                if (s.charAt(i - n) != s1.charAt(i - n)) {
                    ans1--;
                }
                if (s.charAt(i - n) != s2.charAt(i - n)) {
                    ans2--;
                }
            }
            // get min ans
            if (i >= n - 1) {
                ans = Math.min(Math.min(ans1, ans2), ans);
            }
        }
        return ans;
    }
}