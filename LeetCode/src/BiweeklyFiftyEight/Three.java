package BiweeklyFiftyEight;

public class Three {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        k++;
        int n =nums.length;
        int s[]=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            s[i]=s[i-1]+nums[i-1];
        }
        int f[][]=new int[n+1][k+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=k ; j++) {
                f[i][j]=1000000000;
            }
        }
        f[0][0]=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i&&j<=k ; j++) {
                for (int u = i,h=0; u>0 ; u--) {
                    h=Math.max(h,nums[u-1]);
                    f[i][j]=Math.min(f[i][j],f[u-1][j-1]+h*(i-u+1)-(s[i]-s[u-1]));
                }

            }
        }
        return f[n][k];
    }

    public static void main(String[] args) {
        int a[]= {10,20,30};
        new Three().minSpaceWastedKResizing(a,1);
    }
}