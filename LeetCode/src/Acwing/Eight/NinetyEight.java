package Acwing.Eight;

import java.util.Scanner;

public class NinetyEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                dp[i][j]=sc.nextInt();
            }
        }
        int aa[][]= new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                aa[i][j]=-Integer.MAX_VALUE;
            }
        }
        aa[0][0]=dp[0][0];

        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (j>=1)
                {
                    aa[i][j]=Math.max(aa[i][j],dp[i][j]+Math.max(aa[i-1][j],aa[i-1][j-1]));
                }else
                {
                    aa[i][j]=Math.max(aa[i][j],dp[i][j]+aa[i-1][j]);
                }

            }
        }
        int max =0;
        for (int i = 0; i <n ; i++) {
            max=Math.max(max,aa[n-1][i]);
        }
        System.out.println(max);
    }
}
