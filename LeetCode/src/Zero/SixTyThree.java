package Zero;

public class SixTyThree {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;

        if(n==0)
        {
            return 0;
        }
        int m = obstacleGrid[0].length;

        int [][] a = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0]==1)
        {
            return 0;
        }
        a[0][0]=1;
        for(int i=0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==1){break;}
            a[i][0]=1;
        }
        //初始化第一行，只要碰到一个1，那么后边都无法走到
        for(int j=0;j<obstacleGrid[0].length;j++){
            if(obstacleGrid[0][j]==1){break;}
            a[0][j]=1;

        }
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <m ; j++) {
                if(obstacleGrid[i][j]==1)
                {
                    a[i][j]=0;
                    continue;
                }
                a[i][j] = a[i][j-1]+a[i-1][j];

            }
        }
        return a[n-1][m-1];
    }
}
