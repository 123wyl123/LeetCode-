package Thirteen;

import java.lang.reflect.Array;
import java.util.*;

public class FourtyFive {
    public int minJumps(int[] arr) {
        int length =arr.length;
        if(length<=1)
        {
            return 0;
        }
        int min[] = new int[length];
        Arrays.fill(min,Integer.MAX_VALUE);
        Queue<Integer> a = new LinkedList<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        HashMap<Integer, LinkedList<Integer>> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <length ; i++) {
            if (integerIntegerHashMap.containsKey(arr[i]))
            {
                LinkedList<Integer> integers = integerIntegerHashMap.get(arr[i]);
                integers.addLast(i);
            }else
            {
                LinkedList<Integer> integers = new LinkedList<>();
                integers.addLast(i);
                integerIntegerHashMap.put(arr[i],integers);
            }
        }
        a.add(0);
        int temp=0;
        while (a.size()!=0)
        {   int size = a.size();
            for (int i = 0; i <size ; i++) {


                Integer poll = a.poll();
                b.add(poll);
                min[poll] = Math.min(temp,min[poll]);
                if(poll==length-1)
                {
                    return min[poll];
                }
                if ((!b.contains(poll - 1)) && poll - 1 >= 0) {
                    b.add(poll - 1);
                    a.offer(poll-1);
                }
                if ((!b.contains(poll + 1)) && poll + 1 < length) {
                    b.add(poll + 1);
                    a.offer(poll+1);
                }
                if (c.contains(arr[poll]))
                {
                    continue;
                }
                c.add(arr[poll]);
                if (integerIntegerHashMap.containsKey(arr[poll]))
                {
                    LinkedList<Integer> integers = integerIntegerHashMap.get(arr[poll]);
                    for (Integer integer : integers) {
                        if ((!b.contains(integer)) ) {
                            b.add(integer);
                            a.offer(integer);
                        }
                    }
                }
            }
            temp++;
        }
        return min[length-1];
    }
}