package Four;

public class FourtySeven {
    int aa[];
    public int findCircleNum(int[][] M) {

        int length = M.length;
         aa = new int[length];
        for (int i = 0; i <aa.length ; i++) {
            aa[i] = i;
        }
        for (int i = 0; i <M.length ; i++) {
            for (int j = 0; j <M[0].length ; j++) {
                if (M[i][j]==1&&i!=j)
                {
                    int i1 = find(i);
                    int i2 = find(j);
                    if (i1!=i2)
                    {   int min = Math.min(i1,i2);
                        int max = Math.max(i1,i2);
                        aa[max] = min;
                    }
                }
            }
        }
        int k =0;
        for (int i = 0; i <aa.length ; i++) {
           if (aa[i]==i)
           {
               k++;
           }
        }
        System.out.println(k);
        return k;
    }
    public int find( int i)
    {
        if (aa[i]!=i)
        {
            aa[i] = find(aa[i]);
        }
        return aa[i];
    }

    public static void main(String[] args) {
       int a[][] = {{1,0,0,0,1,0,1,0,0,0},{0,1,0,1,0,1,0,0,0,0},{0,0,1,0,0,1,0,0,0,0},{0,1,0,1,0,0,0,0,0,0},{1,0,0,0,1,0,0,0,1,0},{0,1,1,0,0,1,1,0,0,0},{1,0,0,0,0,1,1,0,1,0},{0,0,0,0,0,0,0,1,0,0},{0,0,0,0,1,0,1,0,1,0},{0,0,0,0,0,0,0,0,0,1}};
        new FourtySeven().findCircleNum(a);
    }
}

