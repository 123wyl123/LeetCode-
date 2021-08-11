package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zero {
    public static void main(String[] args) throws Exception{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(scan.readLine());
        while(T>0)
        {
            T--;
            String s[]= scan.readLine().split(" ");
            int b = Integer.valueOf(s[0]);
            int k =Integer.valueOf(s[1]);
            String zhi[]=scan.readLine().split(" ");
            int aa[]=new int[k];
            for (int i = 0; i <k ; i++) {
                aa[i]=Integer.valueOf(zhi[i])%10;
            }
            int a[]=new int[k];
            a[0]=1;
            b=b%10;
            for (int i = 1; i <k ; i++) {
                a[i]=(a[i-1]*b)%10;
            }
            int sum=0;
            for (int i = 0; i <k ; i++) {
                sum=sum+aa[i]*a[k-i-1];
            }
            if (sum%2==0)
            {
                System.out.println("even");

            }else
            {
                System.out.println("odd");
            }
        }
    }
}