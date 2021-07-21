package Acwing.ThirtySeven;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SeventyFive {
    public static void main(String[] args) throws Exception
    { BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(scan.readLine());
        while(T>0)
        {
            T--;
            int n =Integer.parseInt(scan.readLine());
            int a[]=new int[n];
            String[] s = scan.readLine().split(" ");
            boolean b[]=new boolean[n+1];
            HashSet<Integer> integers = new HashSet<>();
            for (int i = 1; i <=n ; i++) {
                integers.add(i);
            }
            HashSet<Integer> integers1 = new HashSet<>();
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.valueOf(s[i]);
                if (a[i]!=0) {
                    integers.remove(a[i]);
                   //xiabiao
                }else
                {
                    integers1.add(i);
                }
            }

            PriorityQueue<Integer> integers2 = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
           int c[]=new int[n];
           int mm=0;
            for (Integer integer : integers1) {
                if (integers.contains(integer+1))
                {
                    integers2.add(integer+1);
                }
            }
            if (integers2.size()>=2) {
                Integer poll = integers2.poll();
                int pre = poll;
                while (integers2.size() != 0) {
                    Integer poll1 = integers2.poll();
                    a[pre - 1] = poll1;
                    pre = poll1;
                    integers.remove(poll1);
                }
                a[pre - 1] = poll;
                integers.remove(poll);
            }else if (integers2.size()==1)
            {
                Integer poll = integers2.poll();
                for (Integer integer : integers1) {
                    if (poll!=integer+1)
                    {
                        a[integer]=poll;
                        break;
                    }
                }
                integers.remove(poll);
            }
            int ll=0;
            for (Integer integer : integers) {
                while (ll<n)
                {
                    if (a[ll]==0)
                    {
                        a[ll]=integer;
                        ll++;
                        break;
                    }else
                    {
                        ll++;
                    }

                }
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");

            }
            System.out.println();
        }
    }


}