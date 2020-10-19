package TwoOneOne;

import java.util.LinkedList;
import java.util.List;

public class Four {
    int Union[];

    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        Union = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            Union[i] = i;
        }
        for (int i = threshold + 1; i < n; i++) {
            for (int j = i; j <= n; j += i) {

                if (find(i) != find(j)) {
                    Union[find(i)] = find(j);
                }

            }
        }

        List<Boolean> booleans = new LinkedList<>();
        for (int i = 0; i < queries.length; i++) {
            if (find(queries[i][0]) == find(queries[i][1])) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }
        return booleans;

    }

    public int find(int i) {

        if (Union[i] != i) {
            Union[i] = find(Union[i]);
        }

        return Union[i];
    }


    public static void main(String[] args) {
        int a[][] = {{1, 4}, {2, 5}, {3, 6}};
        new Four().areConnected(6, 2, a);
    }
}
