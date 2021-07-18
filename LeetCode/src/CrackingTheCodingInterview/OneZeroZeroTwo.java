package CrackingTheCodingInterview;

import java.util.*;

public class OneZeroZeroTwo {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<Integer>> stringArrayListHashMap = new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (stringArrayListHashMap.containsKey(s))
            {
                ArrayList<Integer> integers = stringArrayListHashMap.get(s);
                integers.add(i);
            }else
            {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(i);

                stringArrayListHashMap.put(s,integers);
            }
        }
       List<List<String>> linkedLists = new LinkedList<>();
        for (String s : stringArrayListHashMap.keySet()) {
            LinkedList<String> strings = new LinkedList<>();
            ArrayList<Integer> integers = stringArrayListHashMap.get(s);
            for (Integer integer : integers) {
                strings.addLast(strs[integer]);
            }
            linkedLists.add(strings);
        }
return linkedLists;

    }
}
