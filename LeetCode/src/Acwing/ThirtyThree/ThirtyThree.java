package Acwing.ThirtyThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int t = Integer.valueOf(s);
        int a =1;
        while (t>0)
        {
            t--;
            String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            int n = Integer.valueOf(s2[0]);
            int k = Integer.valueOf(s2[1]);
            String s3 = bufferedReader.readLine();
            int sum =0;
            for (int i = 1; i <=n/2 ; i++) {
                if (s3.charAt(i-1)!=s3.charAt(n-i))
                {
                    sum++;
                }
            }
            System.out.println("Case"+"#"+a+": "+ Math.abs(sum-k));
            a++;
        }
    }
}
