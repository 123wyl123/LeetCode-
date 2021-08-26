package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Seventeen {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int na=Integer.valueOf(s[0]);
        int nb=Integer.valueOf(s[1]);
        String[] s1 = bufferedReader.readLine().split(" ");
        int k =Integer.valueOf(s1[0]);
        int m=Integer.valueOf(s1[1]);
        int a[]=new int[na];
        int b[]=new int[nb];
        String[] s2 = bufferedReader.readLine().split(" ");
        String[] s3 = bufferedReader.readLine().split(" ");
        for (int i = 0; i <na ; i++) {
            a[i]=Integer.valueOf(s2[i]);
        }
        for (int i = 0; i <nb ; i++) {
            b[i]=Integer.valueOf(s3[i]);
        }
        if (a[k-1]<b[nb-m])
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }
}
