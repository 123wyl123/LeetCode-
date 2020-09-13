package TwoZeroSix;

public class One {

    public int numSpecial(int[][] mat) {
        int sum =0;
        boolean flag = true;
        for (int i = 0; i <mat.length ; i++) {
            flag = true;
            for (int j = 0; j <mat[0].length ; j++) {
                if (mat[i][j]==1)
                {
                    for (int k = j+1; k <mat[0].length ; k++) {
                        if (mat[i][k]==1)
                        {
                            flag=false;
                        }
                    }
                    for (int k = 0; k <mat.length ; k++) {
                        if (k==i)
                        {
                            continue;
                        }
                        if (mat[k][j]==1)
                        {
                            flag = false;
                        }
                    }
                    if (flag==false)
                    {
                        break;
                    }else
                    {
                        sum++;
                    }
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][]a = {{1,0,0},
                {0,0,1},
        {1,0,0}};
        new One().numSpecial(a);
    }
}
