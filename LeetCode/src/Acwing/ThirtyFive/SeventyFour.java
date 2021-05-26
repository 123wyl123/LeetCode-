package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeventyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        String[] chars = s.split(" ");
      long a = 0;
        long b= 0;
        long zheng =0;
        long fu = 0;

        for (int i = 0; i <chars.length ; i++) {
            if (Integer.valueOf(chars[i])>0)
            {   zheng++;
                a+=zheng;
                b+=fu;
            }else if (Integer.valueOf(chars[i])<0)
            {
                a+=fu;
                b+=zheng;
               long tmep =zheng;
                zheng=fu;
                fu=tmep;
                fu++;
            }else
            {
                zheng =0;
                fu =0;
            }
        }

        System.out.println(a+" "+b);
    }
}
