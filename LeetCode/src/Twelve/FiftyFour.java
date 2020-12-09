package Twelve;

public class FiftyFour {
    int length;
    int length1;
    boolean gg[][];

    public int closedIsland(int[][] grid) {
        int sum = 0;
        length = grid.length;
        length1 = grid[0].length;
        gg = new boolean[length][length1];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length1; j++) {
                if (grid[i][j] == 0 && !gg[i][j]) {
                    sum += dfs(grid, i, j);
                }
            }
        }
        return sum;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i >= length || i < 0 || j >= length1 || j < 0) {
            return 0;
        }
        if (grid[i][j] == 1) {
            return 1;
        }
        if (gg[i][j]) {
            return 1;
        }

        gg[i][j] = true;

        int dfs =  dfs(grid, i + 1, j);
        int dfs1 = dfs(grid, i - 1, j);
        int dfs2 = dfs(grid, i, j + 1);
        int dfs3 = dfs(grid, i, j - 1);
        return Math.min(dfs, Math.min(dfs1, Math.min(dfs2, dfs3)));
    }

}
