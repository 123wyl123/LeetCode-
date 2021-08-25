package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashSet;

public class Sixteen {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;

            int n= Integer.valueOf(bufferedReader.readLine());
            String[] s = bufferedReader.readLine().split(" ");
            int a[]=new int[n];
            int b[]=new int[n];

            long sum=0;
            for (int i = 0,j=n-1;i<n; i++ ) {
                a[i]=Integer.valueOf(s[i]);
                b[j--]=a[i];
                sum+=a[i];
            }
            if (sum%2!=0)
            {
                System.out.println("NO");
            }else if (check(a,sum)||check(b,sum))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }

        }
    }

    public  static boolean   check(int a[],long he)
    {   long sum[]=new long[a.length+1];
        HashSet<Long> integers = new HashSet<>();
        integers.add(0L);
        for (int i = 1; i <a.length+1 ; i++) {
            sum[i]=sum[i-1]+a[i-1];
            integers.add((long)a[i-1]);
            if (integers.contains(sum[i]-he/2))
            {
                return true;
            }
        }
        return false;

    }

}
