package One;

public class TwentyThree {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int a[][][] = new int[length][2][3];
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <2 ; j++) {
                for (int k = 0; k <3 ; k++) {
                    a[i][j][k] = -10070;
                }
            }
        }
        a[0][0][0] = 0;
        a[0][1][0] = -prices[0];
        int max =0;
        int max1=0;
        int sum =0;
        for (int i = 1; i <length ; i++) {
            a[i][0][0] = Math.max(a[i][0][0],a[i-1][0][0]);
            a[i][1][0] = Math.max(a[i-1][0][0]-prices[i],a[i-1][1][0]);
            max =Math.max(a[i][0][0],a[i][1][0]);

                for (int k = 1; k <=2 ; k++) {
                    a[i][0][k] = Math.max(a[i-1][1][k-1]+prices[i],a[i-1][0][k]);
                    a[i][1][k] = Math.max(a[i-1][1][k],a[i-1][0][k]-prices[i]);
                    max1 = Math.max(a[i][0][k],a[i][1][k]);
                    sum= Math.max(sum,max1);
                }
            sum = Math.max(sum,max);
        }
        return sum;
    }
}
