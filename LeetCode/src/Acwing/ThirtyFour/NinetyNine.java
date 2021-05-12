package Acwing.ThirtyFour;

import java.util.Scanner;

public class NinetyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int m =scanner.nextInt();
        int a[]=new int[m];
        int b[][] = new int[n][n];
        for (int i = 0; i <m ; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                b[i][j]=scanner.nextInt();
            }
        }
        int dp[][]=new int[m][m];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <i ; j++) {
                for (int l = 0; l <=i; l++) {
                    if (l==0)
                    {
                        dp[i][l]=Math.max(dp[i][l],b[a[j]-1][a[i]-1]);
                    }else
                    {
                        if(dp[j][l-1]!=0)
                        {
                            dp[i][l]=Math.max(dp[j][l-1]+b[a[j]-1][a[i]-1],dp[i][l]);
                        }



                    }

                }
            }
        }
        int max =0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <m ; j++) {
                if(j>=m-k-2)
                {
                    max =Math.max(dp[i][j],max);
                }

            }
        }
        System.out.println(max);
    }
}
