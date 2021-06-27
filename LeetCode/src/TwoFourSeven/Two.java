package TwoFourSeven;

import java.util.Deque;
import java.util.LinkedList;

public class Two {
    public int[][] rotateGrid(int[][] grid, int k) {

        for (int i = 0; i <Math.min(grid.length,grid[0].length)/2 ; i++) {
            int h = grid.length-i;
            int w= grid[0].length-i;
            int temp = (grid[0].length-i*2)*2+2*(grid.length-2-i*2);
            int kk = k%temp;

            if (kk==0)
            {
                continue;
            }else
            {
             int a[]=new int[temp];
               int kkk=0;
                for (int j = i; j <h ; j++) {
                    a[kkk++]=grid[j][i];
                }
                for (int j = i+1; j <w ; j++) {
                    a[kkk++]=grid[h-1][j];
                }
                for (int j = h-2; j >=i ; j--) {
                    a[kkk++]=grid[j][w-1];
                }
                for (int j = w-2; j >=i+1 ; j--) {
                    a[kkk++]=grid[i][j];
                }
                int b[]=new int[temp];
                for (int j = 0; j <temp ; j++) {
                    b[(j+k)%temp]=a[j];
                }
                kkk=0;
                for (int j = i; j <h ; j++) {
                    grid[j][i]=b[kkk++];
                }
                for (int j = i+1; j <w ; j++) {
                    grid[h-1][j]=b[kkk++];
                }
                for (int j = h-2; j >=i ; j--) {
                    grid[j][w-1]=b[kkk++];
                }
                for (int j = w-2; j >=i+1 ; j--) {
                    grid[i][j]=b[kkk++];
                }
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        new Two().rotateGrid(a,2);
    }
}
