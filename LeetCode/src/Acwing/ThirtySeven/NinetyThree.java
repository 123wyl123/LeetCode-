package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NinetyThree {

        public static void main(String[] args)throws Exception
        {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.valueOf(scan.readLine());
            while(T>0)
            {   T--;
                String canshu[]=scan.readLine().split(" ");
                int n= Integer.parseInt(canshu[0]);
                int k =Integer.parseInt(canshu[1]);
                String zhi[]=scan.readLine().split(" ");
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    a[i]=Integer.valueOf(zhi[i]);
                }

                Arrays.sort(a);
                int sum=0;
                for(int i=0;i<Math.min(n,k);i++)
                {
                    if(a[i]<0)
                    {
                        sum=sum-a[i];
                    }
                }
                System.out.println(sum);
            }
        }

    }