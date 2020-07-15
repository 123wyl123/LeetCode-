package One;

public class TwetyTwo {
    public int maxProfit(int[] prices) {
        int[][] a = new int[prices.length][2];
        a[0][0] = 0;
        a[0][1] = -prices[0];
        for (int i = 1; i <prices.length ; i++) {
           a[i][0] = Math.max(a[i-1][1]+prices[i],a[i-1][0]);
           a[i][1] = Math.max(a[i-1][0]-prices[i],a[i-1][1]);
        }
        return a[prices.length-1][0];
    }

    public static void main(String[] args) {
        int[]a = {7,1,5,3,6,4};
        new TwetyTwo().maxProfit(a);
    }
}
