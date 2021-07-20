package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeventyFour {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(scan.readLine());
        while (T > 0) {
            T--;
            String[] t = scan.readLine().split(" ");
            int n = Integer.parseInt(t[0]);
            int M = Integer.parseInt(t[1]);
            int a[] = new int[n];
            String[] ss = scan.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(ss[i]);
            }

            int b[] = new int[n];
            b[0] = a[0];
            int pp=b[0];
            for (int i = 1; i < n; i++) {
                if (i % 2 == 1) {
                    b[i] = b[i - 1];
                } else {
                    b[i] =b[i-1]+ (a[i]-pp);
                }
                pp=a[i];
            }
            if (n % 2 == 0) {
                int sum = 0;
                boolean flag = true;
                int ssum = 0;
                int max = 0;
                int pre = a[n-1]-1;
                int liang =0;
                int buliang =0;
                max =b[n-1]+M-a[n-1];
                for (int i = n - 2; i >= 0; i--) {

                    if (flag) {
                        max = Math.max(max, buliang + (pre - a[i]) + b[i]);
                        buliang = buliang+ (pre - a[i])+1;

                    } else {
                        max = Math.max(max,  buliang + (pre - a[i] ) + b[i]);
                liang=liang+ (pre - a[i]);
                    }
                    flag = !flag;
                    pre =a[i]-1;
                }
                System.out.println(max);
            } else {
                int sum = 0;
                boolean flag = false;
                int ssum = 0;
                int max = 0;
                int pre = a[n-1]-1;
                int liang =0;
                int buliang =M-a[n-1]>=1?M-a[n-1]:0;

                max =(M-a[n-1]>=2?M-a[n-1]-1:0)+b[n-1];

                for (int i = n - 2; i >= 0; i--) {


                    if (flag) {
                        max = Math.max(max, buliang + (pre - a[i]) + b[i]);
                        buliang += (pre - a[i] + 1);

                    } else {
                        max = Math.max(max, buliang + (pre - a[i]) + b[i]);
                        liang += pre - a[i];
                    }

                    flag = !flag;
                    pre =a[i]-1;
                }
                System.out.println(max);
            }

        }
    }
}