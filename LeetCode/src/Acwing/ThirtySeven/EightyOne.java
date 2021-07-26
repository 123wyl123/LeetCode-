package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EightyOne {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.valueOf(scan.readLine());
        while (T > 0) {
            T--;
            String aa[] = scan.readLine().split(" ");
            int n = Integer.parseInt(aa[0]);
            int m = Integer.parseInt(aa[1]);
            int a[] = new int[n];
            String arr[] = scan.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(arr[i]);
            }
            int temp = 0;
            int j = 0;
            int sum = 0;
            while (j < n) {
                if (a[j] + sum <= m) {
                    sum += a[j];
                    j++;
                } else {
                    sum = 0;
                    temp++;
                }
            }
            temp++;
            out.write(temp+ "\n");
            out.flush();
        }
    }
}