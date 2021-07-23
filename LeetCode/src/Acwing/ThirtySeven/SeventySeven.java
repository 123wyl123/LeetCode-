package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeventySeven {
    public static void main(String[] args) throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(scan.readLine());
        while(T>0)
        {
            T--;
            int n = Integer.parseInt(scan.readLine());
            char a[]=scan.readLine().toCharArray();
            int k=0;
            int aa[]=new int[n];
            int b=0;
            int w=0;
            for(int i=0;i<n;i++)
            {
               if (a[i]=='B')
               {
                   b++;
               }else
               {
                   w++;
               }
            }
            if (b%2!=0&&w%2!=0)
            {
                System.out.println(-1);
            }else if (b==0||w==0)
            {
                System.out.println(0);
            }else
            {



                  char   c = b % 2 == 0 ? 'B' : 'W';
                     char cc = b % 2 == 0 ? 'W' : 'B';

                for(int i=0;i<n-1;i++)
                {
                    if(a[i]==cc)
                    {
                        continue;
                    }else
                    {
                        a[i]=cc;
                        a[i+1]=a[i+1]==cc?c:cc;
                        aa[k]=i;
                        k++;
                    }
                }
                if (k>3*n)
                {
                    System.out.println(-1);
                }else
                {
                    System.out.println(k);
                    for (int i = 0; i < k; i++) {
                        System.out.print(aa[i]+1);
                        System.out.print(" ");
                    }
                    System.out.println();
                }

            }
        }

    }

}
