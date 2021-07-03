package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirtyThree {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        int a[]=new int[n];
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        int sum =0;
        int si=0;
        int r=0;
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s1[i]);
            sum+=a[i];
            if (a[i]%2==0)
            {
                si++;
            }else
            {
                r++;
            }
        }
        if (sum%2==0)
        {
            System.out.println(si);
        }else
        {
            System.out.println(r);
        }
    }
}
