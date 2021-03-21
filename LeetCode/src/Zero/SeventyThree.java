package Zero;

import java.util.LinkedList;

public class SeventyThree {
    public void setZeroes(int[][] matrix) {
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if (matrix[i][j]==0)
                {
                    integers.add(i);
                    integers1.add(j);
                }
            }
        }
        for (Integer integer : integers) {
            for (int i = 0; i <matrix[0].length ; i++) {
                matrix[integer][i]=0;
            }
        }
        for (Integer integer : integers1) {
            for (int i = 0; i <matrix.length ; i++) {
                matrix[i][integer]=0;
            }
        }

    }
}
