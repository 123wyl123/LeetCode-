package Eight;

public class ThirtyTwo {
    public int[][] flipAndInvertImage(int[][] A) {
        int h = A.length;
        int w = A[0].length;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w/2;j++)
            {
                int temp =A[i][j];
                A[i][j]=A[i][w-1-j];
                A[i][w-1-j]=temp;
                A[i][j] = Math.abs(A[i][j]-1);
                A[i][w-1-j]=Math.abs(A[i][w-1-j]-1);
            }
            if(w%2!=0)
            {
                A[i][w/2]=Math.abs(A[i][w/2]-1);
            }
        }
        return A;
    }
}
