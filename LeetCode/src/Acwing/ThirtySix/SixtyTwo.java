package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SixtyTwo {


    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int n = Integer.valueOf(s);
        String s1 = bufferedReader.readLine();
        String[] s2 = s1.split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(s2[i]);
        }
        long dp[] = new long[n];
        dp[0] = a[0];
        long max = a[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], a[i] + dp[j]);
                    max = Math.max(max, dp[i]);
                }
            }
        }
        System.out.println(max);

    }
}