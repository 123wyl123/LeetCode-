package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class SeventyOne {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.valueOf(bufferedReader.readLine());
        int a[]=new int[n];
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s1[i]);
        }
        HashMap<Integer, ArrayList<Integer>> integerArrayListHashMap = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if (integerArrayListHashMap.containsKey(a[i]-i))
            {
                ArrayList<Integer> integers = integerArrayListHashMap.get(a[i] - i);
                integers.add(a[i]);
                integerArrayListHashMap.put(a[i]-i,integers);
            }else
            {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(a[i]);
                integerArrayListHashMap.put(a[i]-i,integers);
            }
        }
        long max =0;
        for (Integer integer : integerArrayListHashMap.keySet()) {
            ArrayList<Integer> integers = integerArrayListHashMap.get(integer);
            long sum=0;
            for (Integer integer1 : integers) {
                sum+=integer1;
            }
            max =Math.max(sum,max);
        }
        System.out.println(max);
    }
}
