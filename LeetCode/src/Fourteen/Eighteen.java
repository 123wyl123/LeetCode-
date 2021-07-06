package Fourteen;

import java.util.*;

public class Eighteen {
    public List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, Map<String, Integer>> Map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        TreeSet<String> strings2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
                    if (o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    } else if (o1.charAt(i) == o2.charAt(i)) {
                        continue;
                    } else {
                        return 1;
                    }
                }
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        HashSet<String> strings3 = new HashSet<>();

        for (int i = 0; i <orders.size() ; i++) {
            List<String> strings = orders.get(i);
            String s1 = new String(strings.get(2));
            if (strings3.contains(s1))
            {

            }else
            {
                strings3.add(s1);
                strings2.add(s1);
            }

            Integer integer = Integer.valueOf(strings.get(1));
            String s = strings.get(2);
            if (!Map.containsKey(integer))
            {
                HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
                stringIntegerHashMap.put(s,1);
                Map.put(integer,stringIntegerHashMap);
            }else
            {
                java.util.Map<String, Integer> stringIntegerMap = Map.get(integer);
                Map.remove(integer);
                stringIntegerMap.put(s,stringIntegerMap.getOrDefault(s,0)+1);
                Map.put(integer,stringIntegerMap);
            }
        }
        List<List<String>> linkedLists = new LinkedList<>();
        LinkedList<String> strings1 = new LinkedList<>();
        strings1.addLast("Table");
        while (strings2.size()!=0)
        {
            String s = strings2.pollFirst();
            strings1.addLast(s);
        }

        linkedLists.add(strings1);
        while (Map.size()!=0) {


            java.util.Map.Entry<Integer, java.util.Map<String, Integer>> integerMapEntry = Map.pollFirstEntry();
            LinkedList<String> strings = new LinkedList<>();
            Integer key = integerMapEntry.getKey();
            strings.addLast(""+key);
            java.util.Map<String, Integer> value = integerMapEntry.getValue();
            for (int i = 1; i <strings1.size() ; i++) {
                String s = strings1.get(i);
                if (value.containsKey(s))
                {
                    strings.addLast(""+value.get(s));
                }else
                {
                    strings.addLast("0");
                }
            }
            linkedLists.add(strings);
        }
        return linkedLists;
    }
}
