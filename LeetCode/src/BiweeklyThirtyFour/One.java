package BiweeklyThirtyFour;

public class One {
    public int diagonalSum(int[][] mat) {
        int l = mat.length;
        if(l%2==0)
        {   int sum =0;
            for (int i = 0; i <l ; i++) {
                sum+=mat[i][i];
            }
            for (int i = 0; i <l ; i++) {
                sum+=mat[i][l-i-1];
            }
            return sum;
        }
        int sum =0;
        for (int i = 0; i <l ; i++) {
            sum+=mat[i][i];
        }
        for (int i = 0; i <l ; i++) {
            sum+=mat[i][l-i-1];
        }
        return sum-mat[l/2][l/2];
    }
}
