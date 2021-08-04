package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetyTwo {
    public static void main(String[] args)throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(scan.readLine());
        int a[]=new int[1000];
        a[0]=2;
        int l=1;
        for(int i=3;i<=1000;i++)
        {
            if(is_prime(i)==0)
            {
                continue;
            }else
            {
                a[l]=i;
                l++;
            }
        }
        while(T>0)
        {
            T--;
            String[] bb=    scan.readLine().split(" ");
            int n = Integer.valueOf(bb[0]);
            int k = Integer.valueOf(bb[1]);
            int b[]=new int[l];
            for(int sl=0;sl<l-1;sl++)
            {
                b[sl]=a[sl]+a[sl+1];

            }
            int sum=0;
            for(int jj=0;jj<l-1;jj++)
            {
                if(b[jj]+1<=n&&is_prime(b[jj]+1)==1)
                {
                    sum++;
                }else if(b[jj]+1>n)
                {
                    break;
                }
            }
            if(sum>=k)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }

        }
    }

    static   int is_prime(int s)
    {
        for(int i=2;i<=s/i;i++)
        {
            if(s%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
