package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Three {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(bufferedReader.readLine());
        while(T>0)
        {
            T--;
            int n =Integer.valueOf(bufferedReader.readLine());
            int a[]=new int[n];
            String[] s = bufferedReader.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s[i]);
            }
            HashSet<Integer> integers = new HashSet<>();
            int sum=0;
            for (int i = a.length-1; i >=0 ; i--) {
                if (integers.contains(a[i]))
                {
                    sum++;
                }else
                {
                    a[i+sum]=a[i];
                    integers.add(a[i]);
                }
            }
            System.out.println(n-sum);
            for (int i = sum; i <n ; i++) {
                System.out.print(a[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
