package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class SeventyNine {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.valueOf(bufferedReader.readLine());


        HashMap<Integer,String> a = new HashMap<Integer,String>();

        for (int i = 0; i <k ; i++) {
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
            int l =Integer.valueOf(bufferedReader.readLine());
            int aa[]=new int[l];
            String[] s = bufferedReader.readLine().split(" ");
            int sum =0;
            for (int j = 0; j <l ; j++) {
                aa[j]=Integer.valueOf(s[j]);
                sum+=aa[j];
            }
            for (int j = 0; j <l ; j++) {
                integerIntegerHashMap.put(sum-aa[j],j);
            }
            for (Integer integer : integerIntegerHashMap.keySet()) {
                if (a.containsKey(integer))
                {
                    System.out.println("YES");
                    System.out.println(a.get(integer));
                    System.out.println((i+1)+" "+(integerIntegerHashMap.get(integer)+1));
                    return;
                }else
                {
                    a.put(integer,(i+1)+" "+(integerIntegerHashMap.get(integer)+1));
                }
            }
            System.out.println("NO");
        }

    }
}
