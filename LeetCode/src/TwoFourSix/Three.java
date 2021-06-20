package TwoFourSix;

public class Three {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
    boolean flag[][] = new boolean[grid1.length][grid1[0].length];
    int temp=0;
        for (int i = 0; i <grid1.length ; i++) {
            for (int j = 0; j <grid1[0].length ; j++) {
                if (i==4&&j==3)
                {
                    System.out.println();
                }
                if (!flag[i][j]&grid2[i][j]==1)
                {
                    temp+= dfs(grid1,grid2,flag,i,j);
                }

            }
        }
    return temp;
    }
    public int dfs(int [][] grid1 ,int [][] grid2,boolean flag[][],int i,int j)
    {   if (i>=grid1.length||i<0||j>=grid1[0].length||j<0)
    {
        return 1;
    }
        if (flag[i][j])
        {
            return 1;
        }
        flag[i][j]=true;
        if (grid1[i][j]==grid2[i][j]&&grid1[i][j]==1)
        { int temp=1;
          temp= Math.min( dfs(grid1,grid2,flag,i+1,j),temp);
           temp=Math.min( dfs(grid1,grid2,flag,i-1,j),temp);
            temp=Math.min(dfs(grid1,grid2,flag,i,j+1),temp);
            temp = Math.min(dfs(grid1,grid2,flag,i,j-1),temp);
            if (temp==0)
            {
                flag[i][j]=false;
            }
            return temp;
        }else if (grid2[i][j]==1&&grid1[i][j]!=1)
        {
            flag[i][j]=false;
         return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int a[][]={{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int b[][]={{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
        new Three().countSubIslands(a,b);
    }
}
