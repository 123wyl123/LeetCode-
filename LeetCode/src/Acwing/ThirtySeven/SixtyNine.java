package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SixtyNine {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            int n= Integer.valueOf(s1[0]);
            int d = Integer.valueOf(s1[1]);
            int a[]= new int[n];
            String s2 = bufferedReader.readLine();
            String[] s3 = s2.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s3[i]);
            }

            int sum=0;
            for (int i = 1; i <n ; i++) {
                int i1 = a[i];
                int temp=d/(i);
                if (temp<a[i])
                {   sum+=temp;
                    break;
                }else
                {
                    d=d-a[i]*(i);
                    sum+=a[i];
                }
            }
            System.out.println(a[0]+sum);
        }
    }
}
