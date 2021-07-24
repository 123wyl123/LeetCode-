package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeventyEight {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            int n = Integer.valueOf(bufferedReader.readLine());
            int a[]=new int[n+1];
            int summ=0;


            for (int i = 1; i <=n ; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}
