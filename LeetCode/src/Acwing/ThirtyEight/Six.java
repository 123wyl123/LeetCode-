package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(scan.readLine());
        while (T>0)
        {   scan.readLine();
            T--;
            String s = scan.readLine();
            char[] chars = s.toCharArray();
            boolean flag =true;

            for (int i = 0; i <chars.length-1 ; i++) {
                if (chars[i]>chars[i+1])
                {
                    flag=false;
                    System.out.println(s.substring(0,i)+s.substring(i+1));
                    break;
                }
            }
            if (flag)
            {
                System.out.println(s.substring(0,s.length()-1));
            }
        }
    }
}
