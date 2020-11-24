package Twelve;

public class SeventySeven {
    public int countSquares(int[][] matrix) {
        int sum=0;
        int length = matrix.length;
        int length1 = matrix[0].length;
        int dp[][] = new int[length][length1];
        for (int i = 0; i <length1 ; i++) {
            if (matrix[0][i]==1)
            {   sum++;
                dp[0][i]=1;
            }
        }
        for (int i = 1; i <length ; i++) {
            if (matrix[i][0]==1)
            {   sum++;
                dp[i][0]=1;
            }
        }
        for (int i = 1; i <length ; i++) {
            for (int j = 1; j <length1 ; j++) {
                if (matrix[i][j]==1)
                {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                    sum+=dp[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1,0,1},{1,1,0},{1,1,0}};
        new SeventySeven().countSquares(a);
    }
}
