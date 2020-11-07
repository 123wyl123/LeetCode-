package Fourteen;

import java.util.HashMap;

public class NinetySeven {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i] % k;
            if (integerIntegerHashMap.containsKey(k - m) && integerIntegerHashMap.get(k - m) > 0) {
                integerIntegerHashMap.put(k - m, integerIntegerHashMap.get(k - m) - 1);
            } else if (integerIntegerHashMap.containsKey(-m) && integerIntegerHashMap.get(-m) > 0) {
                integerIntegerHashMap.put(-m, integerIntegerHashMap.get(-m) - 1);
            } else if(integerIntegerHashMap.containsKey(-k - m) && integerIntegerHashMap.get(-k - m) > 0){
                integerIntegerHashMap.put(-k-m, integerIntegerHashMap.get(-k-m) - 1);
            }else
            {
                integerIntegerHashMap.put(m, integerIntegerHashMap.getOrDefault(m, 0) + 1);
            }
        }
        if (integerIntegerHashMap.containsKey(0)) {
            Integer integer = integerIntegerHashMap.get(0);
            if (integer % 2 != 0) {
                return false;
            }
        }
        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integer != 0) {
                if (integerIntegerHashMap.get(integer) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {-4, -7, 5, 2, 9, 1, 10, 4, -8, -3};

        new NinetySeven().canArrange(a, 3);

    }
}
