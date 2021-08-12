package Five;

public class Sixteen {
    public int longestPalindromeSubseq(String s) {
    int n =s.length();

    int dp[][]=new int[n][n];
    char aa[]=s.toCharArray();
        for(int i=0;i<n;i++)
    {
        dp[i][i]=1;
        if(i!=n-1)
        {
            dp[i][i+1]=aa[i]==aa[i+1]?2:1;
        }
    }

    for(int i=2;i<n;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            dp[j][j+i]=aa[j]==aa[j+i]?2+dp[j+1][j+i-1]:dp[j][j+i];
            dp[j][j+i]=Math.max(Math.max(dp[j][j+i],dp[j][j+i-1]),dp[j+1][j+i]);
        }
    }
    int max =0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            max =Math.max(max,dp[i][j]);
        }
    }
    return max;
}

    public static void main(String[] args) {
        new Sixteen().longestPalindromeSubseq("bbbab");
    }
}