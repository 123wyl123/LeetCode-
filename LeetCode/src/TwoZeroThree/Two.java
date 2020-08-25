package TwoZeroThree;

import java.util.Arrays;

public class Two {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int k = 0;
        for (int i = piles.length - 2; i > 0; ) {
            sum += piles[i];
            i -= 2;
            k++;
            if (k * 3 == piles.length) {
                break;
            }
        }
        return sum;
    }
}
