package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwentySix {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.valueOf(reader.readLine());
        while (T>0)
        {T--;
            String[] s = reader.readLine().split(" ");
            int a[]=new int[s.length];
            for (int i = 0; i <s.length ; i++) {
                a[i]=Integer.valueOf(s[i]);
            }
            int temp= a[0]-a[1];
            long sum = (long)temp*((long)a[2]/2)+a[0]*(a[2]%2);
            System.out.println(sum);
        }
    }
}
