package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ten {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            int n = Integer.valueOf(bufferedReader.readLine());
            int a[]=new int[n];
            String[] s = bufferedReader.readLine().split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s[i]);
            }
            int l=0;
            int sum=0;
            int cur =0;
            while (l<2*n)
            {
                if (a[l%n]==1)
                {
                    cur++;
                }else
                {
                    sum=Math.max(cur,sum);
                    cur=0;
                }
                l++;
            }
            System.out.println(sum);
        }
    }
}
