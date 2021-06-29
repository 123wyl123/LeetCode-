package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirtyOne {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int T = Integer.valueOf(s);
        while (T>0)
        {
            T--;
            String s1 = bufferedReader.readLine();
            int n =Integer.valueOf(s1);
            int a[]=new int[n];
            String s2 = bufferedReader.readLine();
            String[] s3 = s2.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s3[i]);
            }
            int b[]=new int[n];
            for (int i = 0; i <n-1 ; i+=2) {
                b[i]=a[i+1];
                b[i+1]=-a[i];
            }
            for (int i : b) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
