package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EightySix {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(reader.readLine());
        int n = Integer.valueOf(reader.readLine());
        while (T>0) {
            int a[] = new int[n];
            String[] s = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(s[i]);
            }
            int i;
            int j;
            for (i = 0; i < n; i++) {
                if (a[i] == 1) {
                    break;
                }
            }
            for (j = n - 1; j >= 0; j--) {
                if (a[j] == 1) {
                    break;
                }
            }
            int temp = 0;
            for (int k = i; k < j; k++) {
                if (a[k] == 0) {
                    temp++;
                }
            }
            System.out.println(temp);
            T--;
        }
    }
}
