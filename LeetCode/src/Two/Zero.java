package Two;

public class Zero {
    int sum =0;
    public int numIslands(char[][] grid) {
        boolean gr[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]=='0'||gr[i][j])
                {
                    continue;
                }else
                {
                   sum+= dfs(grid,gr,i,j);
                }
            }
        }
        return sum;
    }
    public int dfs(char[][] grid,boolean gr[][],int h ,int w)
    {
        if (gr[h][w])
        {
            return 0;
        }

        gr[h][w] = true;
            if (h+1<gr.length&&grid[h+1][w]=='1')
            {
                dfs(grid,gr,h+1,w);
            }
            if (w+1<grid[0].length&&grid[h][w+1]=='1')
            {
                dfs(grid,gr,h,w+1);
            }
            if (h-1>=0&&grid[h-1][w]=='1')
            {
                dfs(grid,gr,h-1,w);
            }
            if (w-1>=0&&grid[h][w-1]=='1')
            {
                dfs(grid,gr,h,w-1);
            }

        return 1;
    }
}
