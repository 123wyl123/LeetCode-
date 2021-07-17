package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Seventy {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String s = bufferedReader.readLine();
            String[] s2 = s.split(" ");
            int n= Integer.valueOf(s2[0]);
            int a = Integer.valueOf(s2[1]);
            int b = Integer.valueOf(s2[2]);
            int c= Integer.valueOf(s2[3]);
            String s1 = bufferedReader.readLine();
            char[] chars = s1.toCharArray();
            int a0=0;
            int a1=0;
            for (int i = 0; i <chars.length ; i++) {
                if (chars[i]=='0')
                {
                    a0++;
                }else
                {
                    a1++;
                }
            }
            System.out.println(Math.min(Math.min(a*a0+a1*c+a1*a,b*a1+a0*c+a0*b),a*a0+b*a1));
        }
    }
}
