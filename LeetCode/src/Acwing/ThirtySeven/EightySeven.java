package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EightySeven {
    public static void main(String[] args)throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String[] s = bufferedReader.readLine().split(" ");
            int a= Integer.valueOf(s[0]);
            int b= Integer.valueOf(s[1]);
            int temp = a%b;
            if (temp==0)
            {
                System.out.println(0);
            }else {


                System.out.println(b - temp);
            }
        }
    }
}
