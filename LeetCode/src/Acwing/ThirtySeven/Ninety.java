package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ninety {
    public static void main(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] s = scan.readLine().split(" ");
        int n=Integer.valueOf(s[0]);
        int c = Integer.valueOf(s[1]);
        String[] s1 = scan.readLine().split(" ");
        int a[]=new int[s1.length];
        for (int i = 0; i <s1.length ; i++) {
            a[i]=Integer.valueOf(s1[i]);
        }
        int l=0;
        int max =0;
        int maxl=a[0];
        int x=1;
        for (int i = 1; i <s1.length ; i++) {
            if (a[i]-a[i-1]<=c)
            {
                x++;
            }else
            {
              x=1;
            }
        }

        System.out.println(x);
    }
}
