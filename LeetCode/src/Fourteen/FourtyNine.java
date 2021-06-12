package Fourteen;

import java.util.Arrays;

public class FourtyNine {
    public String largestNumber(int[] cost, int target) {
        String a[] =new String[target+1];

    a[0]="";
        for(int j = 1;j<=target;j++)
        {
            a[j]="bu";
        }

        for(int i=cost.length;i>=1;i--)
        {
            for(int j = 1;j<=target;j++)
            {   if (i==7&&j==4)
            {
                System.out.println();
            }
                if(cost[i-1]>j)
                {
                    continue;
                }else if(j==cost[i-1]&&a[j].equals("bu"))
                {
                    a[j]=i+"";
                }else
                {
                    if(!"bu".equals(a[j-cost[i-1]])&&!a[j].equals("bu"))
                    {
                        a[j]=compare(a[j-cost[i-1]]+i,a[j]);
                    }else if (!"bu".equals(a[j-cost[i-1]])&&a[j].equals("bu"))
                    {
                        a[j]=a[j-cost[i-1]]+i;
                    }

                }
            }
        }
        return a[target].equals("bu")?"0":a[target];
    }

public static String compare(String a, String b)
{
        if (a.length()>b.length())
        {
            return a;
        }else if (b.length()>a.length())
        {
            return b;
        }else
        {
            for (int i = 0; i <a.length() ; i++) {
                if (a.charAt(i)>b.charAt(i))
                {
                    return a;
                }else if (b.charAt(i)>a.charAt(i))
                {
                    return b;
                }else
                {
                    continue;
                }
            }
        }
        return a;
}

    public String largestNumber1(int[] cost, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int c : cost) {
            for (int j = c; j <= target; ++j) {
                dp[j] = Math.max(dp[j], dp[j - c] + 1);
            }
        }
        if (dp[target] < 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 8, j = target; i >= 0; i--) {
            for (int c = cost[i]; j >= c && dp[j] == dp[j - c] + 1; j -= c) {
                sb.append(i + 1);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
       int a[]= {6,10,15,40,40,40,40,40,40};

        new FourtyNine().largestNumber1(a,47);
    }
}
