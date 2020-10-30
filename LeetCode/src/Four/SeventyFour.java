package Four;

public class SeventyFour {
    public int findMaxForm(String[] strs, int m, int n) {
        int max = 0;
        int a[][][] = new int[strs.length+1][m+1][n+1];
        for (int i = 1; i <strs.length+1 ; i++) {
            char[] chars = strs[i-1].toCharArray();
            int a1 =0;
            int a2 = 0;
            for (int j = 0; j <chars.length ; j++) {
                if (chars[j]=='1')
                {
                    a1++;
                }else
                {
                    a2++;
                }
            }
            for (int k = 0; k <=m ; k++) {
            for (int j =0; j<=n; j++) {
                    a[i][k][j] = a[i-1][k][j];
                    if (k>=a2&&j>=a1)
                    {
                        a[i][k][j] =Math.max( a[i-1][k-a2][j-a1]+1,a[i][k][j]);
                    }

                    max = Math.max(max,a[i][k][j]);
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {
      String a[] =  {"10","0001","111001","1","0"};
      new SeventyFour().findMaxForm(a,5,3);
    }
}
