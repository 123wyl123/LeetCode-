package TwoFourFour;

public class Three {
    public int minFlips(String s) {
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