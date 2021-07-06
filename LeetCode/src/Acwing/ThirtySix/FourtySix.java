package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FourtySix {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {   T--;
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            Integer a[]=new Integer[3];

            for (int i=0;i<3;i++)
            {
                a[i]=Integer.valueOf(s1[i]);
            }
            Arrays.sort(a, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            int sum =0;
            for (int i = 0; i <3 ; i++) {
                if (a[i]>0)
                {
                    a[i]--;
                    sum++;
                }
            }
            for (int i = 0; i <3 ; i++) {
                for (int j = i+1; j <3 ; j++) {
                    if (a[i]>0&&a[j]>0)
                    {
                        a[i]--;
                        a[j]--;
                        sum++;
                    }
                }
            }
          if (a[0]>0&&a[1]>0&&a[2]>0)
          {
              sum++;
          }
            System.out.println(sum);
        }
    }
}
