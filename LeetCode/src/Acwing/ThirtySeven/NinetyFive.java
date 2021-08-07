package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NinetyFive {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String s[]= scan.readLine().split(" ");
        int a=Integer.valueOf(s[0]);
        int b= Integer.valueOf(s[1]);
        int c= Integer.valueOf(s[2]);
        int d = Integer.valueOf(s[3]);
        int ss =Math.max(a,Math.max(b,Math.max(c,d)));
        int x = ss-a;
        int x1=ss-b;
        int x2=ss-c;
        int x3=ss-d;
        int aa[]=new int[4];
        aa[0]=x;
        aa[1]=x1;
        aa[2]=x2;
        aa[3]=x3;
        Arrays.sort(aa);
        for(int i=1;i<4;i++)
        {
            System.out.print(aa[i]);
            System.out.print(" ");
        }

    }
}
