package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class SeventyTwo {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            int n =Integer.valueOf(bufferedReader.readLine());
            int a[]=new int[n];
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s1[i]);
            }
            Arrays.sort(a);
            for (int i = 0; i <n/2 ; i++) {
                int temp =a[i];
                a[i]=a[n-1-i];
                a[n-1-i]=temp;
            }
            for (int i = 0; i <n ; i++) {
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
