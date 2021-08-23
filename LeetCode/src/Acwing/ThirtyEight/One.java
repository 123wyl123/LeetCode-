package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws Exception{
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(Reader.readLine());
        while (T>0)
        {
            T--;
            int n=  Integer.valueOf(Reader.readLine());
            int a[]=new int[n];
            String[] s = Reader.readLine().split(" ");
            int max =0;
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s[i]);
                max =Math.max(max,a[i]);
            }
            int c=0;
            int maxc=0;
            for (int i = 0; i <n ; i++) {
                if (a[i]==max)
                {
                    c++;
                    maxc=Math.max(c,maxc);
                }else
                {
                    c=0;
                }
            }
            System.out.println(maxc);
        }

    }
}
