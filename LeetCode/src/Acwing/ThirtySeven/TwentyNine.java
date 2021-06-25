package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentyNine {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int t = Integer.valueOf(s);
        while (t>0)
        {   t--;
            int n = Integer.valueOf(bufferedReader.readLine());
            int a[]= new int[n];
            String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s2[i]);
            }
            int b[]=new int[n];
            int r =n-1;
            int l = n-1;
            int temp =n-1;
            while (temp>=0)
            {
                l=Math.min(l,temp-a[temp]);
                if (l<temp)
                {
                    b[temp]=1;
                }
                temp--;
            }
            for (int i : b) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
