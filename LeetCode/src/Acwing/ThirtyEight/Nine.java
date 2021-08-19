package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nine {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            int n =Integer.valueOf(bufferedReader.readLine());
            int a[] = new int[n];
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            int min =Integer.MAX_VALUE;
            int max =0;
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s1[i]);
                min =Math.min(min,a[i]);
                max =Math.max(max,a[i]);
            }
            int mini =0;
            int sum1=Integer.MAX_VALUE;
            for (int i = min; i <=max ; i++) {
                int sum=0;
                for (int j = 0; j <n ; j++) {
                    sum+=Math.min(Math.abs(a[j]-i),Math.min(Math.abs(a[j]-(i-1)),Math.abs(a[j]-(i+1))));
                }
                if (sum1>sum) {


                    sum1 = Math.min(sum1, sum);
                    mini=i;
                }
            }
            System.out.println(mini+" "+sum1);
        }
    }
}
