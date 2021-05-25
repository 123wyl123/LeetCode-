package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiftyFour {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int i = Integer.valueOf(s);
        while (i>0)
        {
            i--;
            String s1 = bufferedReader.readLine();
            char[] chars = s1.toCharArray();
            chars[31] = (char)(chars[31]+1);
            int temp =0;
            for (int j = chars.length-1; j >=0 ; j--) {
                if (chars[j]+temp>='2')
                {
                    chars[j]=(char)(chars[j]+temp-2);
                    temp=1;
                }else
                {   chars[j]=(char)(chars[j]+temp);
                    temp=0;
                }
            }
            boolean flag = false;
            if (temp==1)
            {   flag=false;
                System.out.println("1"+new String(chars));
            }else
            {   flag = true;
                System.out.println(new String(chars));
            }

            chars[30]=(char)(chars[30]+1);
        temp=0;
            for (int j = chars.length-1; j >=0 ; j--) {
                if (chars[j]+temp>='2')
                {
                    chars[j]=(char)(chars[j]+temp-2);
                    temp=1;
                }else
                {    chars[j]=(char)(chars[j]+temp);
                    temp=0;
                }
            }
            if (temp==1)
            {   flag=false;
                System.out.println("1"+new String(chars));
            }else
            {   if (flag)
            {
                System.out.println(new String(chars));
            }else
            {
                System.out.println("1"+new String(chars));
            }


            }


        }
    }
}

