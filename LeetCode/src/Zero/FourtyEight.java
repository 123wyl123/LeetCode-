package Zero;

public class FourtyEight {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int length1 = matrix[0].length;
        for (int i = 0; i <length ; i++) {
            for (int j = i; j <length1 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <length1/2 ; j++) {
                int temp = matrix[i][j];

                matrix[i][j] = matrix[i][length1-j-1];
                matrix[i][length1-j-1]= temp;
            }
        }
    }

    public static void main(String[] args) {
         int [][]a ={{1,2,3},{4,5,6},{7,8,9}};
         new FourtyEight().rotate(a);
    }
}
