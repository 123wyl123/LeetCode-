package TwoFiveThree;



public class Four {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {


        if (obstacles.length == 0) {
            return null;
        }

        int[] dp = new int[obstacles.length];
        int[] ends = new int[obstacles.length];
        ends[0] = obstacles[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for (int i = 1; i < obstacles.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (obstacles[i] >= ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            ends[l] = obstacles[i];
            dp[i] = l + 1;
        }

        return dp;
    }


}

