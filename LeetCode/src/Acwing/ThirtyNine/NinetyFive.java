package Acwing.ThirtyNine;

import java.io.*;
import java.util.*;
class Main
{
    public static void main(String [] args)throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1[]=reader.readLine().split(" ");
        int n=Integer.valueOf(a1[0]);
        int k1=Integer.valueOf(a1[1]);
        int k2=Integer.valueOf(a1[2]);
        int a[]=new int[n];
        int b[]=new int[n];
        String a2[]=reader.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.valueOf(a2[i]);
        }
        String a3[]=reader.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            b[i]=Integer.valueOf(a3[i]);
        }
        long sum=0;
        PriorityQueue <Integer> temp=    new PriorityQueue<Integer>((Integer c,Integer d)->
        {
            return Math.abs(b[d]-a[d])-Math.abs(b[c]-a[c]);
        });
        for(int i=0;i<n;i++)
        {
            temp.add(i)    ;
        }
        while(k1+k2!=0)
        {       int cur=temp.poll();
            if(k1!=0)
            {

                int aaa = Math.abs(a[cur]-b[cur]);
                if(a[cur]>b[cur])
                {
                    a[cur]--;

                }else if (a[cur]<b[cur])
                {
                    a[cur]++;
                }else
                {
                    a[cur]++;
                }
                k1--;
                temp.add(cur);
            }else if(k2!=0)
            {

                int aaa = Math.abs(a[cur]-b[cur]);
                if(a[cur]>b[cur])
                {
                    a[cur]--;

                }else if (a[cur]<b[cur])
                {
                    a[cur]++;
                }else
                {
                    a[cur]++;
                }
                k2--;
                temp.add(cur);
            }
        }
        for(int i=0;i<n;i++)
        {   int tt=Math.abs(a[i]-b[i]);
            sum=sum+(long)tt*(long)tt;
        }
        System.out.println(sum);
    }
}