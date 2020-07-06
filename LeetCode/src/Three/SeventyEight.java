package Three;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SeventyEight {
    public int kthSmallest(int[][] matrix, int k) {

//        int a = matrix.length;
//        int m=a*a;
//        int l=0;
//        int b[] = new int[m];
//        for (int i = 0; i < a ; i++) {
//            for (int j = 0; j <a; j++) {
//                b[l] = matrix[i][j];
//                l++;
//            }
//        }
//        Arrays.sort(b);
//        return b[k-1];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }
        for (int i = 0; i < k - 1; i++) {
            int[] now = pq.poll();
            if (now[2] != n - 1) {
                pq.offer(new int[]{matrix[now[1]][now[2] + 1], now[1], now[2] + 1});
            }
        }
        return pq.poll()[0];


    }
    public int kthSmallest1(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (check(matrix, mid, k, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        int num = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;
    }

    public static void main(String[] args) {
        int a[][]={{1,5,9},{10,11,13},{12,13,15}};
        new SeventyEight().kthSmallest(a,8);
    }
}
