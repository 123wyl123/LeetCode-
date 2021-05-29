package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EightyThree {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String kk= bufferedReader.readLine();
        String[] s2 = kk.split(" ");
        int n =Integer.valueOf(s2[0]);
        int k =Integer.valueOf(s2[1]);
        String s = bufferedReader.readLine();
        int a[]= new int[n];
        String[] s1 = s.split(" ");
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s1[i]);
        }
        Arrays.sort(a);
        int dp[]=new int[n];
        for (int i = 0; i <n ; i++) {
            boolean flag = true;
            for (int j = i+1; j <n ; j++) {
                if (a[j]-a[i]<=5)
                {
                    continue;
                }else
                {   flag=false;
                    dp[i]=j-1;
                    break;
                }
            }
            if (flag)
            {
                dp[i]=n-1;
            }
        }
        int dpd[][] = new int[n][k];
        int sum =0;
        dpd[n-1][0]=1;

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j <k ; j++) {
                if (dp[i]+1<n&&i+1<n&&j-1>=0)
                {
                    dpd[i][j]=Math.max(dpd[i+1][j],dpd[dp[i]+1][j-1]+dp[i]-i+1);

                }else
                {
                    dpd[i][j]=Math.max(dpd[i+1][j],dp[i]-i+1);
                }
                sum=Math.max(sum,dpd[i][j]);
            }
        }
        System.out.println(sum);
    }
}
