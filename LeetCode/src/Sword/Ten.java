package Sword;

public class Ten {
    public int fib(int n) {
  if(n==0)
    {
        return 0;
    }else if(n==1)
    {
        return 1;
    }
    long dp[]=new long[n+1];
    dp[0]=0;
    dp[1]=1;
        for(int i=2;i<=n;i++)
    {
        dp[i]=(dp[i-1]+dp[i-2])%(1000000007);
    }
        return (int)(dp[n])%(1000000007);
}
}