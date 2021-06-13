package BiweeklyFiftyFour;

public class Three {
    public int largestMagicSquare(int[][] grid) {
        int length = grid.length;
        int width = grid[0].length;

        long l[][]=new long[length][width];
        for (int i = 0; i <length ; i++) {
            l[i][0]=grid[i][0];
        }
        for (int i = 0; i <length ; i++) {
            for (int j = 1; j <width ; j++) {
                l[i][j]=l[i][j-1]+grid[i][j];
            }
        }
        long d[][]=new long[length][width];
        for (int i = 0; i <width ; i++) {
            d[0][i]=grid[0][i];
        }
        for (int i = 1; i <length ; i++) {
            for (int j = 0; j <width ; j++) {
                d[i][j]=d[i-1][j]+grid[i][j];
            }
        }
        int sum =1;
        for (int i = 2; i <=Math.min(length,width) ; i++) {
            if (dfs(i,d,l,grid))
            {   sum=i;
                continue;

            }
        }
        return (int) sum;
    }
    public boolean dfs(int size,long d[][], long l[][],int[][] grid)
    {        int length = d.length;
        int width = d[0].length;

        for (int i = 0; i <=length-size ; i++) {
            for (int j = 0; j <=width-size ; j++) {
                long temp = d[i+size-1][j]-d[i][j]+grid[i][j];
                boolean flag = true;
                for (int k = 1; k <size ; k++) {
                    if (d[i + size - 1][j + k] - d[i][j + k] + grid[i][j + k] != temp) {
                        flag=false;
                        break;
                    }
                }
                if (!flag)
                {
                    continue;
                }
                for (int m = 0; m <size ; m++) {
                    if (l[i+m][j+size-1]-l[i+m][j]+grid[i+m][j]!=temp)
                    {
                        flag=false;
                        break;
                    }
                }
                if (!flag)
                {
                    continue;
                }
                long sum =0;
                for (int m = 0; m <size ; m++) {
                    sum+=grid[i+m][j+m];
                }
                if (sum!=temp)
                {
                    continue;
                }
                sum=0;
                for (int m = 0; m <size ; m++) {
                    sum+=grid[i+m][j+size-1-m];
                }
                if (sum==temp)
                {
                    return true;
                }
            }

        }

        return false;
    }
}