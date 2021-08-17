package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Seven {


    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(scan.readLine());
        while (T > 0) {
            T--;
            String a[] = scan.readLine().split(" ");
            int n = Integer.valueOf(a[0]);
            int k = Integer.valueOf(a[1]);
            int temp = n / k;
            int yu = n % k;
            StringBuffer aa = new StringBuffer();
            for (int i = 0; i < temp; i++) {
                for (int j = 0; j < k; j++) {
                    aa.append((char) ('a' + j));
                }
            }
            for (int j = 0; j < yu; j++) {
                aa.append((char) ('a' + j));
            }
            System.out.println(aa.toString());
        }

    }


}

