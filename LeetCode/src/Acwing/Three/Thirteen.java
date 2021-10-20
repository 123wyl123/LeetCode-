package Acwing.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Thirteen {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int F = Integer.valueOf(s[0]);
        int V = Integer.valueOf(s[1]);
        int a[][]=new int[F][V];
        for (int i = 0; i <F ; i++) {
            String[] s1 = reader.readLine().split(" ");
            for (int j = 0; j <V ; j++) {
                a[i][j]=Integer.valueOf(s1[j]);
            }
        }

        int temp[]=new int[V];
        int max=Integer.MIN_VALUE;
        int sum[][]=new int[F+1][V+1];
        for (int i = 1; i <=F ; i++) {
            for (int j = 0; j <=V ; j++) {
                sum[i][j]=-100000;
            }
        }

        for (int i = 1; i <=F ; i++) {
            for (int j = 1; j <=V ; j++) {
                sum[i][j]=Math.max(sum[i-1][j-1]+a[i-1][j-1],sum[i][j-1]);
            }
        }
        for (int i = 1; i <=V; i++) {
            max=Math.max(sum[F][i],max);
        }
        System.out.println(max);
        StringBuffer ss = new StringBuffer();
        for (int i = F; i >=1 ; i--) {
            for (int j =1 ; j <=V ; j++) {
                if (sum[i][j]==max)
                {
                    max-=a[i-1][j-1];
                    ss.append(j);
                    if (i!=1)
                    {
                        ss.append(" ");
                    }
                    break;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] s1 = ss.toString().split(" ");
        for (int i = s1.length-1; i >=0; i--) {
            stringBuffer.append(s1[i]);
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer.toString());
    }
}
