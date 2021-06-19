package Acwing.ThirtySix;

import java.util.Scanner;

public class NinetyFive {

    public static void main(String[] args) throws  Exception{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int sum =0;
        long summ[]=new long[51];
        summ[0]=1;
        for (int i = 1; i <=50 ; i++) {
            summ[i]=summ[i-1]*2+1;
        }
        int dfs = dfs(n - 1, k, 1, summ);
        System.out.println(dfs);
    }

    public static int dfs(long n,long k,int length,long summ[])
    {
        if (k<=summ[(int)n]/2)
        {
            return dfs(n-1,k,length,summ);
        }else if (k==summ[(int)n]/2+1)
        {
            return (int)n+1;
        }else
        {
            return dfs(n-1,k-1-summ[(int)n]/2,length,summ);
        }
    }

}
