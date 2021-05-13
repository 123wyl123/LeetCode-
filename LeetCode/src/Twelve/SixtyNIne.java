package Twelve;

public class SixtyNIne {
    public int numWays(int steps, int arrLen) {
        int maxColumn = Math.min(arrLen-1 , steps+1);
        long a[][] = new long[steps][maxColumn+2];
        a[0][0]=1;
        a[0][1]=1;
        for (int i = 1; i <steps ; i++) {
            for (int j = 0; j <=maxColumn ; j++) {
                if (j==0)
                {
                    a[i][j]=(a[i-1][j]+a[i-1][j+1])%1000000007;
                }else   if (j+1<=maxColumn)
                {
                    a[i][j] = (a[i-1][j-1]+a[i-1][j]+a[i-1][j+1])%1000000007;
                }else
                {
                    a[i][j] = (a[i-1][j-1]+a[i-1][j])%1000000007;
                }
            }
        }
        return (int)( (a[steps-1][0])%1000000007);


    }

    public static void main(String[] args) {
        new SixtyNIne().numWays(4,2);
    }
}
