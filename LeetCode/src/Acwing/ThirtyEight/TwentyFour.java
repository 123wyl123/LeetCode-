package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(reader.readLine());
        while (T>0)
        {
            T--;
            int n = Integer.valueOf(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int a[]=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s[i]);
            }
            int One=0;
            int Zero=0;
            int sum=0;
            for (int i = 0; i <n ; i++) {
                if (a[i]==0)
                {
                    Zero++;

                }else
                {   if (Zero==i)
                {
                    sum+=Zero;
                }else if (Zero>=2)
                {
                    sum+=Zero;
                }

                    Zero=0;

                }
            }
            System.out.println(n-sum-Zero);
        }
    }
}
