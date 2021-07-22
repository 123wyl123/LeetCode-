package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeventySix {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(scan.readLine());
        while (T > 0) {
            T--;
            String[] aa = scan.readLine().split(" ");
            int a = Integer.parseInt(aa[0]);
            int b = Integer.parseInt(aa[1]);
            int c = Integer.parseInt(aa[2]);
            int d = Integer.parseInt(aa[3]);
            int e = Integer.parseInt(aa[4]);
            int f = Integer.parseInt(aa[5]);
            int max = 0;
            max = Math.max(Math.min(a, d) * e + Math.min(d - Math.min(a, d), Math.min(c, b)) * f, max);

            max = Math.max(Math.min(Math.min(c, d), b) * f + Math.min(d - Math.min(Math.min(c, d), b), a) * e, max);
            System.out.println(max);
        }
    }
}
