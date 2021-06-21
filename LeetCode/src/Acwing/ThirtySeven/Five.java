package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Five {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        Integer t = Integer.valueOf(s);
        while (t>0)
        {
            t--;
            String s1 = bufferedReader.readLine();
            Integer n = Integer.valueOf(s1);
            int a[]=new int[n];
            String s2 = bufferedReader.readLine();
            String[] s3 = s2.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s3[i]);
            }
            Arrays.sort(a);
            int b[]=new int[101];
            int sum =0;
            for (int i = 0; i <n ; i++) {
                b[a[i]]++;
            }
            boolean flag = true;
            for (int i = 0; i <101 ; i++) {
                if (b[i]==0)
                {   if (flag)
                {
                    sum=i*2;
                }else
                {
                    sum=sum+i;
                }
                    break;
                }else if (b[i]==1&&flag)
                {   sum=i;
                    flag = false;
                }
            }
            System.out.println(sum);
        }
    }
}
