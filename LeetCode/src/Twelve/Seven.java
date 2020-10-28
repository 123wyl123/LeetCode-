package Twelve;

import java.util.HashMap;
import java.util.HashSet;

public class Seven {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            integerIntegerHashMap.put(arr[i],integerIntegerHashMap.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> integers = new HashSet<>();
        for (Integer integer : integerIntegerHashMap.keySet()) {
           if(integers.contains( integerIntegerHashMap.get(integer)))
            {
                return false;
            }else
           {
               integers.add(integerIntegerHashMap.get(integer));
           }
        }
        return true;
    }
}
