package TwoZeroTwo;

import java.util.Arrays;

public class Three {
    public int maxDistance(int[] position, int m) {
        int l = 0;
        int r = 1000000000;
        Arrays.sort(position);

        while (l < r) {
            int mid = (l + r + 1) /2;
            int cur = 1;
            int last = position[0];
            for (int i = 1; i < position.length; i++) {

                if (position[i] - last >= mid) {
                    last = position[i];
                    cur++;
                }

            }
            if (cur >= m) {
                l = mid;

            } else {
                r = mid - 1;
            }
        }
        return r;
    }

}

