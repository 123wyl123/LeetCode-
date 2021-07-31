package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EightyEight {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.valueOf(bufferedReader.readLine());
        int a[]=new int[n];
        String[] s = bufferedReader.readLine().split(" ");
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s[i]);
        }
        int b[]=new int[n];
        b[0]=a[0];
        for (int i = 1; i <n ; i++) {
            b[i]=b[i-1]+a[i];
        }
        int temp=0;
        for (int i = 0; i <n-1 ; i++) {
            if (b[n-1]-b[i]==b[i])
            {
                temp++;
            }
        }
        System.out.println(temp  );
    }
}
