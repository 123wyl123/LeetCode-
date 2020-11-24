package Thirteen;

public class TwentyNine {
    public int[][] diagonalSort(int[][] mat) {
        int length = mat.length;
        int length1 = mat[0].length;
        boolean flag = false;
        for (int i = 0; i <length1; i++) {
            flag = false;
            int k=0;
            int lengthl = Math.min(length1-i,length);
            for (int j = length; j >0 ; j--) {
                if (flag)
                {
                    break;
                }
                flag = true;
                for (int l = 0; l <lengthl-1; l++) {
                    if (mat[k+l][i+l]<=mat[k+l+1][i+l+1])
                    {
                        continue;
                    }else
                    {   flag = false;
                        int temp = mat[k+l][i+l];
                        mat[k+l][i+l] = mat[k+l+1][i+l+1];
                        mat[k+l+1][i+l+1] = temp;
                    }
                }

            }
        }
        for (int i = 1; i <length ; i++) {

            flag = false;
            int k=0;
            int lengthl = Math.min(length1,length-i);
            for (int j = length; j >0 ; j--) {
                if (flag)
                {
                    break;
                }
                flag=true;
                for (int l = 0; l <lengthl-1; l++) {
                    if (mat[i+l][k+l]<mat[i+l+1][k+l+1])
                    {
                        continue;
                    }else
                    {   flag = false;
                        int temp = mat[i+l][k+l];
                        mat[i+l][k+l] = mat[i+l+1][k+l+1];
                        mat[i+l+1][k+l+1] = temp;
                    }
                }

            }
        }
        return mat;
    }

    public static void main(String[] args) {
       int a[][] = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        new TwentyNine().diagonalSort(a);
    }
}
