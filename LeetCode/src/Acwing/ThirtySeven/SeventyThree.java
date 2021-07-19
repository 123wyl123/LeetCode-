package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class SeventyThree {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            int n = Integer.valueOf(s1[0]);
            int x = Integer.valueOf(s1[1]);
            String s2 = bufferedReader.readLine();
            String[] s3 = s2.split(" ");
            int a[]=new int[n];
            HashSet<Integer> integers = new HashSet<>();
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s3[i]);
                integers.add(a[i]);
            }
            Arrays.sort(a);
            if (integers.contains(x))
            {
                System.out.println(1);
            }else
            {
                if (a[n-1]>x)
                {
                    System.out.println(2);
                }else
                {   boolean flag = true;
                int max = Integer.MAX_VALUE;
                    for (int i = n-1; i >=0 ; i--) {
                        max =Math.min(x/a[i]+(a[i]==0?0:1),max);
                    if (x%a[i]==0)
                    {   flag = false;
                    max =Math.min(max,x/a[i]);
                        System.out.println(max);
                        break;
                    }
                    }
                    if (flag)
                    {
                        System.out.println((x/a[n-1])+1);
                    }
                }
            }
        }
    }
}
