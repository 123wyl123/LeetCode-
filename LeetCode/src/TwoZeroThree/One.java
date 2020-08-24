package TwoZeroThree;

import java.util.LinkedList;
import java.util.List;

public class One {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int aa[] = new int[n+1];

        for (int i = 0; i+1 < rounds.length; i++) {
            int a = rounds[i];
            int b = rounds[i + 1];
            while (a != b) {
                aa[a]++;
                a++;
                if (a > n) {
                    a -= n;
                }

            }
        }
        aa[rounds[rounds.length - 1]]++;
        int max = 0;
        for (int i : aa) {
            max = Math.max(max, i);
        }
        List<Integer> integers = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (max == aa[i]) {
                integers.add(i);
            }
        }
        return integers;
    }
}
