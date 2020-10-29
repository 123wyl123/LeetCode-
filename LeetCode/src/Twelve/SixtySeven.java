package Twelve;

public class SixtySeven {

    public int countServers(int[][] grid) {
        int sum =0;
        int l =0;
        for (int i = 0; i <grid.length ; i++) {
            int pre =0;
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==1)
                {
                    l++;
                    pre = j;
                }
            }
            if (l==1)
            {
                for (int j = 0; j <grid.length ; j++) {
                    if (grid[j][pre]==1&&j!=i)
                    {   sum+=l;
                        break;
                    }
                }

            }else if(l>=2)
            {
                sum+=l;
            }
            l=0;
        }
        return sum;

    }
}
