package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentyFive {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int T=Integer.valueOf(s);
        while (T>0)
        {   T--;
            String s1 = bufferedReader.readLine();
            String s2[] = s1.split(" ");
            int l =Integer.valueOf(s2[0]);
            int r = Integer.valueOf(s2[1]);
            if (r>=2*l)
            {
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
            }

        }
    }
}
