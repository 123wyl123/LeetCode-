package Three;

public class Four {
    int a[][];
    int l ;
    int w ;
    int temp [][];
    public Four(int[][] matrix) {
       l= matrix.length;
       if (l==0)
       {
           return;
       }
       w = matrix[0].length;

        a = new int[l][w];
        temp = new int[l][w];

        for (int i = 0; i <l ; i++) {
            for (int j = 0; j <w ; j++) {
                a[i][j] = matrix[i][j];
                if (j>0)
                {
                    temp[i][j] = matrix[i][j]+matrix[i][j-1];
                }else
                {
                    temp[i][j] = matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int max =0;
        for (int i = row1; i <row2 ; i++) {
            max +=temp[row1][col2]-temp[row1][col1]+a[row1][col1];
        }
        return max;
    }
}
