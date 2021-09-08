package Five;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Two {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int A[][] = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            A[i][0] = profits[i];
            A[i][1] = capital[i];
        }
        Arrays.sort(A, (a, b) ->
            a[1] - b[1]
        );
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) ->
              b - a
        );
        int j = 0;
        for (int i = 0; i < k; i++) {
            while (j < profits.length && A[j][1] <= w) {
                pq.add(A[j][0]);
                j++;
            }
            if (!pq.isEmpty()) {
                w += pq.poll();
            } else {
                break;
            }
        }
        return w;

    }
}