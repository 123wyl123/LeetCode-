package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class NinetySeven {
    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int T = Integer.valueOf(s);
        while (T > 0) {
            T--;
            int n = Integer.valueOf(bufferedReader.readLine());
            int a[] = new int[n];
            String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(s2[i]);
            }
            int dp[][] = new int[n][n];
            for (int i = 0; i < n - 1; i++) {
                dp[i][i] = 1;
                dp[i][i + 1] = a[i] == a[i + 1] ? 2 : 1;
            }
            dp[n - 1][n - 1] = 1;
            boolean flag = true;
            for (int i = 2; i < n; i++) {


                for (int j = 0; j < n - i; j++) {
                    dp[j][j + i] = Math.max(dp[j + 1][j + i], dp[j][j + i - 1]);
                    if (a[j] == a[j + i]) {
                        dp[j][j + i] = Math.max(dp[j + 1][j + i - 1] + 2, dp[j][j + i]);
                    }
                    if (dp[j][j + i] >= 3) {
                        System.out.println("YES");
                        flag = false;
                        break;
                    }

                }
                if (!flag) {
                    break;
                }

            }
            if (flag) {
                System.out.println("NO");
            }
        }
    }
}

