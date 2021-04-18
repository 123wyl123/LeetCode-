package FiveZero;

import java.util.Arrays;
import java.util.Comparator;

public class Two {
    public int[] countPoints(int[][] points, int[][] queries) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int a[] = new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int temp =0;
            for (int j = 0; j <points.length ; j++) {
                if (Math.abs(points[j][0]-queries[i][0])*Math.abs(points[j][0]-queries[i][0])+Math.abs(points[j][1]-queries[i][1])*Math.abs(points[j][1]-queries[i][1])<=queries[i][2]*queries[i][2])
                {
                    temp++;
                }
            }
            a[i] = temp;
        }
        return a;
    }
}
