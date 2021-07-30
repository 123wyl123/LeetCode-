package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EightyFive {
    public static void main(String[] args) throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String aa[] =scan.readLine().split(" ");
        int n = Integer.valueOf(aa[0]);
        int k = Integer.valueOf(aa[1]);
        int a[][]=new int[n+1][n+1];
        int b[][]=new int[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            char c[]= scan.readLine().toCharArray();
            for(int j=0;j<n;j++)
            {   if(c[j]=='#')
            {

            }else
            {
                a[i+1][j+1]=a[i+1][j]+1;
                b[i+1][j+1]=b[i][j+1]+1;
            }
            }
        }
        int bc[][]=new int [n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <=n ; j++) {
                if (a[i][j]>=k)
                {
                    for (int l = 0; l <k ; l++) {
                        bc[i][j-l]++;
                    }
                }

            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (b[i][j]>=k)
                {
                    for (int l = 0; l <k ; l++) {
                        bc[i-l][j]++;
                    }
                }
            }
        }
        int max =0;
        int maxi=1;
        int maxj=1;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if (bc[i][j]>max)
                {
                    maxi=i;
                    maxj=j;
                    max = bc[i][j];
                }
            }
        }
        System.out.print(maxi);
        System.out.print(" ");
        System.out.println(maxj);
    }

}
