package JINSHAN;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        int a[][]=new int[n+1][n+1];
        int max =0;
        for (int i = 1; i <=n ; i++) {
            String[] s = reader.readLine().split(" ");
            int b[]=new int[i+1];
            for (int j = 1; j <=i ; j++) {
                b[j]=Integer.valueOf(s[j-1]);
            }
            if (i<n)
            {
                for (int j = 1; j <=i ; j++) {
                    a[i][j]=Math.max(Math.max(a[i-1][j],a[i][j-1])+b[j],a[i][j]);
                }
            }else
            {
                for (int j = 1; j <i ; j++) {
                    a[i][j]=a[i-1][j]+b[j];
                    max =Math.max(max,a[i][j]);
                }

            }
        }

        System.out.println(max);
    }
}
