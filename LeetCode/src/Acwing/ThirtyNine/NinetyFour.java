package Acwing.ThirtyNine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(reader.readLine());
        while(T>0)
        {
            T--;
            String s[]=   reader.readLine().split(" ");
            int a= Integer.valueOf(s[0]);
            int b= Integer.valueOf(s[1]);
            int c= Integer.valueOf(s[2]);
            int d= Integer.valueOf(s[3]);
            int k=Integer.valueOf(s[4]);
            int tempa=(a/c)+((a%c)==0?0:1);
            int tempb=(b/d)+((b%d)==0?0:1);
            if(tempa+tempb<=k)
            {
                System.out.print(tempa);
                System.out.print(" ");
                System.out.println(tempb);
            }else
            {
                System.out.println(-1);
            }
        }

    }
}