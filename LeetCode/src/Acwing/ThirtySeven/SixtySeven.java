package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class SixtySeven {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        String s = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();
        String[] s2 = s.split(" ");
        String[] s3 = s1.split(" ");
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s2[i]);
        }
        for (int i = 0; i <n ; i++) {
            b[i]=Integer.valueOf(s3[i]);
        }
        int sum=0;
        int c[]=new int[n];
        for (int i = 0; i <n ; i++) {
            c[i]=a[i]-b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i <n ; i++) {
            if (c[i]<0)
            {
                sum+=(c[i]);
            }else if (c[i]==0)
            {
                continue;
            }else
            {
                sum+=c[i];
            }
        }

        if (c[n-1]<=0)
        {
            System.out.println(-1);
            return;
        }
        int sums=1;
        for (int i = n-2; i >0 ; i--) {
            if (c[i]==c[n-1])
            {
                sums++;
            }
        }
        if (sum>0)
        {
            System.out.println(1);
        }else if (sum==0)
        {
            System.out.println(2);
        }else
        {
            sum=-sum;
            System.out.println(sum/(sums*c[n-1])+2);
        }
    }
}
