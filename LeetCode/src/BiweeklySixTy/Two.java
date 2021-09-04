package BiweeklySixTy;

import java.util.LinkedList;

public class Two {
    int ab[][]={{1,0},{-1,0},{0,1},{0,-1}};
    LinkedList<int[]> a =new LinkedList<>();
    public int[][] findFarmland(int[][] land) {
        for (int i = 0; i <land.length ; i++) {

            for (int j = 0; j <land[0].length ; j++) {
                if (land[i][j]==1) {
                    int as[]=new int[2];
                    as=find(land,i,j );
                    int ax[]=new int[4];
                    ax[0]=i;
                    ax[1]=j;
                    ax[2]=as[0];
                    ax[3]=as[1];
                    a.addLast(ax);
                }
            }
        }
        int result[][]=new int[a.size()][4];
        int hh=0;
        for (int[] ints : a) {
            for (int i = 0; i <4 ; i++) {
                result[hh++][i]=ints[i];
            }
        }
        return result;
    }
    public int [] find(int [][] land,int i,int j)
    {

        if (i<0||i>=land.length||j<0||j>=land[0].length)
        {
            int a[]={-1,-1};
            return a;
        }
        if (land[i][j]==0)
        {   int a[]={-1,-1};
            return a;
        }
        land[i][j]=0;
       int maxi=i;
       int maxj=j;
        for (int k = 0; k <4 ; k++) {
           int aa[]= find(land,i+ab[k][0],j+ab[k][1]);
           maxi=Math.max(aa[0],maxi);
           maxj=Math.max(aa[1],maxj);
        }
       int ax[]={maxi,maxj};
        return ax;
    }

    public static void main(String[] args) {
        int a[][]={{0,1},{1,0}};
        new Two().findFarmland(a);
    }
}
