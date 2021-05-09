package Sixteen;

import java.util.Arrays;
import java.util.Comparator;

public class TwentySix {
    public int bestTeamScore(int[] scores, int[] ages) {
        int a[][] =  new int[ages.length][2];
        for (int i = 0; i <a.length ; i++) {
            a[i][1] = scores[i];
            a[i][0] = ages[i];
        }
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(b[1], a[1]);
                }
                return Integer.compare(b[0], a[0]);
            }
        });
        int dp[]  = new int[scores.length];
        int res =0;
        for (int i = 0; i <scores.length ; i++) {

            int pre = a[i][1];
            dp[i] = pre;
            for (int j = 0; j <i ; j++) {
                if (a[j][1]>=pre)
                {
                    dp[i] = Math.max(dp[i],dp[j]+pre);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
