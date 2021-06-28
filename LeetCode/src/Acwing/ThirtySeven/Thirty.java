package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Thirty {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
        Integer n= Integer.valueOf(bufferedReader.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s1[i]);
            }
        String s2 = bufferedReader.readLine();
        String[] s3 = s2.split(" ");
        for (int i = 0; i <n ; i++) {
                b[i]=Integer.valueOf(s3[i]);
        }
        String s4 = bufferedReader.readLine();
        String[] s5 = s4.split(" ");
        for (int i = 0; i <n ; i++) {
            c[i]=Integer.valueOf(s5[i]);
        }
            int d[]=new int[n];
            d[0]=a[0];
            for (int i = 1; i <n ; i++) {
                if (i!=n-1)
                {


               if (a[i]!=d[i-1])
               {    d[i]=a[i];
                   continue;
               }
               if (b[i]!=d[i-1])
               {
                   d[i]=b[i];
                   continue;
               }
               if (c[i]!=d[i-1])
               {
                   d[i]=c[i];
                   continue;
               }}else
                {
                    if (a[i]!=d[i-1]&&a[i]!=d[0])
                    {    d[i]=a[i];
                        continue;
                    }
                    if (b[i]!=d[i-1]&&b[i]!=d[0])
                    {
                        d[i]=b[i];
                        continue;
                    }
                    if (c[i]!=d[i-1]&&c[i]!=d[0])
                    {
                        d[i]=c[i];
                        continue;
                    }
                }
            }
            for (int i = 0; i <n ; i++) {
                if (i!=n-1)
                {
                    System.out.print(d[i]);
                    System.out.print(" ");
                }else
                {
                    System.out.print(d[i]);
                }
            }
            System.out.println();
        }
        }
}
