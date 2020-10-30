package Four;

public class SixtyThree {
    public int islandPerimeter(int[][] grid) {
        int l = 0;
        int temp =0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==1)
                {
                  temp  =  check(grid,i,j);
                }
                l+=temp;
                temp=0;
            }
        }
        return l;
    }
    public int check(int [][] grid,int i, int j)
    {   int temp = 0;
        if (i-1>=0&&grid[i-1][j]==1)
        {
            temp++;
        }
        if (i+1<=grid.length-1&&grid[i+1][j]==1)
        {
            temp++;
        }
        if (j-1>=0&&grid[i][j-1]==1)
        {
            temp++;
        }
        if (j+1<=grid[0].length-1&&grid[i][j+1]==1)
        {
            temp++;
        }
        return 4-temp;
    }
}
