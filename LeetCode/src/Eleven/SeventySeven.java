package Eleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SeventySeven {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        char[] chars = s.toCharArray();
        int length = s.length();
        HashMap<Integer,Integer> a[] = new HashMap[length];
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put(chars[0]-'a',1);
        a[0] = integerIntegerHashMap;
        for (int i = 1; i <length ; i++) {
            char aChar = chars[i];
            HashMap<Integer, Integer> integerIntegerHashMap2 = new HashMap<>();
            HashMap<Integer, Integer> integerIntegerHashMap1 = a[i - 1];
            for (Integer integer : integerIntegerHashMap1.keySet()) {
                integerIntegerHashMap2.put(integer,integerIntegerHashMap1.get(integer));
            }
            integerIntegerHashMap2.put(aChar-'a',integerIntegerHashMap2.getOrDefault(aChar-'a',0)+1);
            a[i] = integerIntegerHashMap2;
        }
        LinkedList<Boolean> booleans = new LinkedList<>();
        for (int[] query : queries) {
            int i = query[0];
            int i1 = query[1];
            int sum =0;
            if (i==0)
            {
                HashMap<Integer, Integer> integerIntegerHashMap1 = a[i1];
                for (Integer integer : integerIntegerHashMap1.keySet()) {
                    sum+=(integerIntegerHashMap1.get(integer))%2;
                }
                if (sum/2<=query[2])
                {
                    booleans.addLast(true);
                }else
                {
                    booleans.addLast(false);
                }
            }else
            {
                HashMap<Integer, Integer> integerIntegerHashMap1 = a[i1];
                HashMap<Integer, Integer> integerIntegerHashMap2 = a[i - 1];
                for (Integer integer : integerIntegerHashMap1.keySet()) {
                    sum+=(integerIntegerHashMap1.get(integer)-integerIntegerHashMap2.getOrDefault(integer,0))%2;
                }
                if (sum/2<=query[2])
                {
                    booleans.addLast(true);
                }else
                {
                    booleans.addLast(false);
                }
            }
        }
        return booleans;
    }
    public List<Boolean> canMakePaliQueries1(String s, int[][] queries) {
        int[] cnt = new int[s.length() + 1];
        int i = 0;
        for (char c : s.toCharArray()) {
            cnt[i + 1] = cnt[i++] ^ (1 << (c - 'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] q : queries) {
            int sum = 0;
            sum += Integer.bitCount(cnt[q[1] + 1] ^ cnt[q[0]]);
            res.add(sum / 2 <= q[2]);  // if odd, just put it in center;
        }
        return res;
    }
    public static void main(String[] args) {

        int a[][]    =            {{0,1,0},{2,2,1}};
        new SeventySeven().canMakePaliQueries1(    "lyb",a);
    }
}
