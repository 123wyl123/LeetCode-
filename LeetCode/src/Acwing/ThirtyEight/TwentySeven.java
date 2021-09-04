package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentySeven {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(reader.readLine());
        while (T>0)
        {
            T--;
            String[] s = reader.readLine().split(" ");
            int a= Integer.valueOf(s[0]);
            int b= Integer.valueOf(s[1]);
            b=(int)Math.pow(10,b);
            long temp=0;
            if (a>b)
            {
             temp= gcd(a,b);
            }else
            {
                temp=gcd(b,a);
            }
            if (temp==1)
            {
                System.out.println((long)b*(long) a);
            }else
            {
                System.out.println((long)b*(long) a/temp);
            }
        }



    }
    public  static int gcd(int a,int b)
    {
        while (b!=0)
        {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;

    }
}
