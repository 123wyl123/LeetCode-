package Seventeen;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ThirtyEight {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int a[][] = new int[matrix.length+1][matrix[0].length+1];

        for (int i = 1; i <=matrix.length ; i++) {
            for (int j = 1; j <=matrix[0].length ; j++) {
                if (i==1&&j==1)
                {
                    a[i][j]=matrix[i-1][j-1];
                    integers.offer(a[i][j]);
                }else
                {
                    a[i][j]=a[i-1][j]^a[i][j-1]^matrix[i-1][j-1];
                    if (i-1>=0&&j-1>=0)
                    {
                        a[i][j]=a[i][j]^a[i-1][j-1];
                    }
                    if (integers.size()<k)
                    {
                        integers.offer(a[i][j]);
                    }else if(integers.peek()<a[i][j])
                    {
                        integers.poll();
                        integers.offer(a[i][j]);
                    }
                }
            }
        }
        return integers.peek();
    }


}
