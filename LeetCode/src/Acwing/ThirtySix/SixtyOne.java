package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SixtyOne {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        Integer T = Integer.valueOf(s);
        while (T>0)
        {
            T--;
            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();
            String[] s3 = s1.split(" ");
            int n= Integer.valueOf(s3[0]);
            int k =Integer.valueOf(s3[1]);
            String[] s4 = s2.split(" ");
            int a[]=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s4[i]);
            }
            int l =0;
            int r=0;
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
            for (int i = 0; i <n ; i++) {
                integerIntegerHashMap.put(a[i],1);
            }

            int min =Integer.MAX_VALUE;
            for (Integer integer : integerIntegerHashMap.keySet()) {
                int sum=0;
                 l =0;
                 r=0;
                while (l<n&&r<n)
                {
                    if (integer==a[r])
                    {
                        if (l==r)
                        {
                            l++;
                            r++;
                        }else
                        {
                            r++;
                        }
                    }else
                    {
                        r++;
                    }
                    if (r-l==k)
                    {
                        l=r=r;
                        sum++;
                    }
                }
                if (l!=r)
                {
                    sum++;
                }
               min =Math.min(sum,min);
            }
            System.out.println(min);

        }
    }
}
