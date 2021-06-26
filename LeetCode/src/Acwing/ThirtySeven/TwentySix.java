package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentySix {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            int n =Integer.valueOf(bufferedReader.readLine());
            int a[]=new int[n];
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");

            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s1[i]);
            }
            int l =0;
            int r=0;
            for (int i = 0; i <n ; i++) {
                if (a[i]%2==0)
                {
                    l++;
                }else
                {
                    r++;
                }
            }
            if (l!=0&&r!=0)
            {
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
            }
        }
    }
}
