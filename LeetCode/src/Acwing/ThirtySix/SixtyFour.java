package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SixtyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        int n = Integer.valueOf(s1[0]);
        int k = Integer.valueOf(s1[1]);
        int p = Integer.valueOf(s1[2]);
        int x = Integer.valueOf(s1[3]);
        int y = Integer.valueOf(s1[4]);
        int a[]=new int[k];
        int b[]=new int[n-k];
        String s2 = bufferedReader.readLine();
        String[] s3 = s2.split(" ");
        int temp =0;
        for (int i = 0; i <k ; i++) {
            a[i]=Integer.valueOf(s3[i]);
            temp+=a[i];
        }
        Arrays.sort(a);
        int mid =n/2;
        if (mid+1<=k)
        {
            int i = a[mid];
            if (i<y)
            {
                System.out.println(-1);
                return;
            }
            int w=0;
            for (int j = 0; j <k ; j++) {
                if (a[j]>=y)
                {   w=j;
                    break;
                }
            }
            for (int j = 0; j <Math.min(n-k,mid-w) ; j++) {
                b[j]=1;
                temp++;
            }
            for (int j = mid-w; j <n-k ; j++) {
                temp+=y;
                b[j]=y;
            }
            if (temp>x)
            {
                System.out.println(-1);
                return;
            }else
            {

                for (int kk = 0; kk <n-k ; kk++) {
                    System.out.print(b[kk]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }else
        {

            int j=0;
            boolean flag =true;
            for (int i = 0; i <k ; i++) {
                if (a[i]>=y)
                {   flag = false;
                    j=i;
                    break;
                }
            }
            if (flag)
            {
                j=k;
            }
            for (int i = 0; i <Math.min(mid-j,n-k) ; i++) {
                temp++;
                b[i]=1;
            }
            for (int i = mid-j; i <n-k ; i++) {
                temp+=y;
                b[i]=y;
            }
            if (temp>x)
            {
                System.out.println(-1);
            }else
            {
                for (int i = 0; i <n-k ; i++) {
                    System.out.print(b[i]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }

    }
}
