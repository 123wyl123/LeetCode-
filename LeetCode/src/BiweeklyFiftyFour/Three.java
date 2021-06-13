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

    public static void main(String[] args) {
        int c[][]={{8,6,12,20,3,11,6,9,3,19,14,9,9},{9,19,6,9,11,4,14,7,7,3,17,6,6},{3,1,2,3,18,5,13,4,9,11,18,13,15},{16,11,19,18,16,19,15,19,7,6,15,20,9},{10,16,3,7,5,16,1,13,12,15,1,19,17},{16,17,14,19,13,10,11,15,18,6,3,4,17},{18,10,18,7,8,9,16,10,19,16,9,9,6},{13,13,1,13,18,9,2,12,1,19,11,15,11},{9,17,5,20,3,3,19,18,18,20,7,17,1},{1,6,14,3,5,2,6,4,19,2,11,4,8},{8,2,16,1,18,13,7,7,10,4,16,10,19}};
        int b[][]={{4,2,4,9,8,4,10,4},{3,10,10,1,5,1,1,6},{1,2,2,8,1,6,4,1},{4,6,8,3,5,7,8,6},{6,7,3,4,9,2,10,9},{10,1,6,3,2,3,4,5}};
        int a[][]={{5,1,3,1},{9,3,3,1},{1,3,3,8}};
        new Three().largestMagicSquare(a);
    }
}
