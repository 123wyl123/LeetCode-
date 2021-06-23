package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Twenty {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int T= Integer.valueOf(s);

        while (T>0)
        {      String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            int n = Integer.valueOf(s2[0]);
            int x= Integer.valueOf(s2[1]);
            T--;
            int a[]=new int[n];
            int b[]=new int[n];
            String s3 = bufferedReader.readLine();
            String[] s4 = s3.split(" ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.valueOf(s4[i]);
            }
            String s5 = bufferedReader.readLine();
            bufferedReader.readLine();
            String[] s6 = s5.split(" ");
            for (int i = 0; i <n ; i++) {
                b[i]=Integer.valueOf(s6[i]);
            }

            TreeMap<Integer, Integer> integerIntegerTreeMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i <n ; i++) {
                integerIntegerTreeMap.put(b[i],integerIntegerTreeMap.getOrDefault(b[i],0)+1);
            }
            int temp =0;
          boolean flag = true;
            for (int i = 0;i<n;i++)
            {   temp = x-a[i];
                Integer integer = integerIntegerTreeMap.floorKey(temp);
               if (integer==null)
               {    flag = false;
                   System.out.println("No");
                   break;
               }else if (integerIntegerTreeMap.get(integer)==1)
               {
                   integerIntegerTreeMap.remove(integer);
               }else
               {
                   integerIntegerTreeMap.put(integer,integerIntegerTreeMap.get(integer)-1);
               }

            }
if (flag)
{
    System.out.println("Yes");
}


        }
    }
}
