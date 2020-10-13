package One;

public class ThirtyTwo {
    public int minCut(String s) {
        if (s.length()==0||s.length()==1)
        {
            return 0;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean isValis[][] = new boolean[length][length];
        for (int i = 0; i <length ; i++) {
            isValis[i][i] = true;
        }
        for (int i = 0; i <length-1 ; i++) {
            isValis[i][i+1] = chars[i]==chars[i+1];
        }
        for (int i = length-3; i >=0 ; i--) {
            for (int j = i+2; j <length ; j++) {
               isValis[i][j] = chars[i]==chars[j]&&isValis[i+1][j-1];
            }
        }
        int dp[] = new int[length+1];
        for (int i = 0; i <=length ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[length] = 0;
        for (int i = length-1; i >=0 ; i--) {
            for (int j = i; j <length ; j++) {
                if (isValis[i][j])
                    dp[i] = Math.min(dp[i],dp[j+1]+1);
            }
        }
        return dp[0];
    }
}
