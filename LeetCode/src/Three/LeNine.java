package Three;

public class LeNine {
    public int maxProfit(int[] prices) {
      int [][] p = new int[prices.length][prices.length];
      p[0][0] = 0;
      p[0][1] = -prices[0];
      p[0][2] = 0;

        for (int i = 0; i <prices.length ; i++) {

           p[i][0] = p[i-1][1]+prices[i];
           p[i][1] = Math.max(p[i-1][2]-prices[i],p[i-1][1]);
           p[i][2] = Math.max(p[i-1][0],p[i-1][2]);







        }
        return Math.max(p[prices.length-1][0],p[prices.length-1][2]);
    }

}
