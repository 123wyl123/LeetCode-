package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class EightyFour {
    public static void main(String[] args)throws Exception
    {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.valueOf(scan.readLine());
        int a[]=new int[n];
        String b[] =scan.readLine().split(" ");
        char s[] = scan.readLine().toCharArray();
        int d[] = new int[n-1];
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(b[i]);
        }
        for (int i = 0; i <n-1 ; i++) {
            d[i]=s[i]-'0';
        }
        int l =0;
        int r =0;
        while (r<n-1)
        {
            if (d[r]==1)
            {
                r++;
            }else
            {
                Arrays.sort(a,l,r+1);
                r++;
                l=r;
            }

        }
        Arrays.sort(a,l,n);
        boolean flag =true;
        for (int i = 0; i <n-1 ; i++) {
            if (a[i]>a[i+1])
            {
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("YES");
        }
    }
}
