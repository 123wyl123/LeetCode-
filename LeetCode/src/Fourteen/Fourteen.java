package Fourteen;

import java.util.TreeSet;

public class Fourteen {
    public int findMinFibonacciNumbers(int k) {
        TreeSet<Integer> temp = new TreeSet<>();
        int a=1;
        int b=1;
        temp.add(b);
        temp.add(a);
        while (b<=k)
        {
            int c= a+b;
            temp.add(c);
            a=b;
            b=c;
        }
        int cur=0;
        while (k>0)
        {
            Integer ceiling = temp.floor(k);
            k-=ceiling;
            cur++;
        }
        return cur;
    }

}