package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwentySeven {
 static   HashMap<Long, Integer> integerIntegerHashMap = new HashMap<>();
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            int n = Integer.valueOf(s1[0]);
            int k = Integer.valueOf(s1[1]);
            String s2 = bufferedReader.readLine();
            String[] s3 = s2.split(" ");
            long a[] =new long[n];
            for (int i = 0; i <n ; i++) {
                a[i]=Long.parseLong(s3[i]);
            }
            boolean flag =true;
            HashMap<Long, Integer> integerIntegerHashMap = new HashMap<>();
            int bb[]=new int[100];
            for (int i = 0; i <n ; i++) {

                long temp = a[i];
                long kk=0;
                long temp1=temp;
                while (temp1>0)
                {
                    temp1=temp1/k;
                    kk++;
                }

                for (long j = kk; j >=0 ; j--) {
                    if (temp-pow(k,j)>=0)
                    {
                        temp-=pow(k,j);
                        bb[(int)j]++;
                    }

                }
                if ((int)temp!=0)
                {
                    flag=false;
                    break;
                }
            }

            for (int i : bb) {
                if (i>1)
                {
                    flag = false;
                    break;
                }

            }



            if (flag==true)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
    public static long pow(long k,long j)
    {   long temp=1;
        while (j>0)
        {
            temp=temp*k;
            j--;
        }
        return temp;
    }
}