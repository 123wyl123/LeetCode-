package Ten;

public class LeTwentyFive {
    public boolean divisorGame(int N) {
        boolean dp[ ]  = new boolean[N+1];
        if(N==1)
        {
            return false;
        }
        dp[0] = false;
        dp[1] =  false ;
        dp[2] =  true;
        for (int i=3;i<=N;i++)
        {
            dp[i] = false;
            for (int j =1;j<i;j++)
            {
                if(i%j==0&&!dp[i-1])
                {

                    dp[i]=true;
                    break;

                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args) {
        new LeTwentyFive().divisorGame(10);
    }
}
