package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetyFour {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int n = Integer.valueOf(s);
        String s1 = bufferedReader.readLine();
        char[] chars = s1.toCharArray();
        int temp=0;
        for (int i = 0; i <n ; i++) {
            if (chars[i]=='A')
            {
                temp++;
            }else
            {
                temp--;
            }
        }
        if (temp==0)
        {
            System.out.println("T");
        }else if (temp>0)
        {
            System.out.println("A");
        }else
        {
            System.out.println("B");
        }
    }
}
