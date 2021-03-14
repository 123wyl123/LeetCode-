package TwoThreeTwo;

import java.util.HashMap;

public class Three {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <edges.length ; i++) {
            integerIntegerHashMap.put(edges[i][0],integerIntegerHashMap.getOrDefault(edges[i][0],0)+1);
            integerIntegerHashMap.put(edges[i][1],integerIntegerHashMap.getOrDefault(edges[i][1],0)+1);
        }
        int max =0;
        int temp =0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
           if (integerIntegerHashMap.get(integer)>max)
           {
               max = integerIntegerHashMap.get(integer);
               temp=integer;
           }
        }
        return temp;
    }
}
