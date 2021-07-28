package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class EightyThree {



    public  static  void main(String[] args) throws Exception
    {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        String[] a=    re.readLine().split(" ");
        long n = Long.valueOf(a[0]);
        int k = Integer.valueOf(a[1]);
        LinkedList<Long> longs = new LinkedList<>();

        int sum=0;
        for (int i = 1; i <=n/i ; i++) {
 if(n % i == 0) {
             longs.addLast((long)i);
                if(i != n / i) longs.addLast(n/i);
            }
        }
        Collections.sort(longs);
        if (longs.size()<k)
        {
            System.out.println(-1);
        }else
        {
            System.out.println(longs.get(k-1));
        }
    }
}
