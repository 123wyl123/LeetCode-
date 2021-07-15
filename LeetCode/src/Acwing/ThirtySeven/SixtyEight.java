package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SixtyEight {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int n= Integer.valueOf(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        char[] chars = s.toCharArray();
        int l=0;
        int sum=0;
        int ss =0;
        while (l<n)
        {
            if (chars[l]=='x')
            {
                sum++;
            }else
            {
                sum=0;
            }
            l++;
            if (sum==3)
            {
                sum--;
                ss++;
            }
        }
        System.out.println(ss);
    }
}
