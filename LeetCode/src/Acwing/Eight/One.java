package Acwing.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class One {
    public static void main(String[] args)throws Exception
    {
        BufferedReader scan =new BufferedReader(new InputStreamReader(System.in));
        String zhi[]= scan.readLine().split(" ");
        String a_a[]=scan.readLine().split(" ");
        int n= Integer.valueOf(zhi[0]);
        int x= Integer.valueOf(zhi[1]);
        int y=Integer.valueOf(zhi[2]);
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.valueOf(a_a[i]);
        }
        Arrays.sort(a);
        if(y+y<n)
        {
            System.out.println(-1);
        }
        for(int i=x-1;i<y;i++)
        {
            if(n-i-1<=y)
            {
                System.out.println(a[i]);
                break;
            }
        }

    }


}
