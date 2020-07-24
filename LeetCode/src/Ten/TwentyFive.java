package Ten;

public class TwentyFive {
    public boolean divisorGame(int N) {
         return N%2==0?true:false;
    }
    public boolean divisorGame1(int N)
    {
        boolean dp[] = new boolean[N+1];
        dp[1] = false;
        dp[2] = true;
        dp[3] = false;
        for (int i = 4; i <=N ; i++) {
            for (int j = 1; j <i ; j++) {
                if(i%j==0&&dp[i-j]==false)
                {
                    dp[j]=true;
                    break;
                }
            }
        }
        return dp[N];
    }

}

