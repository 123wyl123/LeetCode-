package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SixtyThree {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            int n = Integer.valueOf(s1[0]);
            int m = Integer.valueOf(s1[1]);
            int a[][]=new int[n][m];
            int sum1=0;
            int max =1000;
            int sum=0;
            int ttt=0;
            for (int i = 0; i <n ; i++) {
                String s2 = bufferedReader.readLine();
                String[] s3 = s2.split(" ");
                for (int j = 0; j <m ; j++) {
                    a[i][j]=Integer.valueOf(s3[j]);
                    sum+=Math.abs(a[i][j]);
                    if (a[i][j]<0)
                    {
                        sum1++;
                    }
                    max =Math.min(max,Math.abs(a[i][j]));
                }
            }

            if (sum1%2==0)
            {
                System.out.println(sum);
            }else
            {
                System.out.println(sum-max*2);
            }

        }
    }

}