package TwoFourEight;

import java.util.Arrays;
import java.util.Comparator;

public class Four {
    public int longestCommonSubpath(int n, int[][] paths) {
        Arrays.sort(paths, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1.length-o2.length;
            }
        });

    }
}