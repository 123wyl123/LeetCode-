package Seventeen;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class FourtyThree {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        HashSet<Integer> integers = new HashSet<>();
        HashMap<Integer, LinkedList> integerIntegerHashMap1 = new HashMap<>();
        for (int i = 0; i <adjacentPairs.length ; i++) {
            integerIntegerHashMap.put(adjacentPairs[i][0],integerIntegerHashMap.getOrDefault(adjacentPairs[i][0],0)+1);
            integerIntegerHashMap.put(adjacentPairs[i][1],integerIntegerHashMap.getOrDefault(adjacentPairs[i][1],0)+1);
            if (integerIntegerHashMap1.containsKey(adjacentPairs[i][0]))
            {
                LinkedList linkedList = integerIntegerHashMap1.get(adjacentPairs[i][0]);
                linkedList.addLast(adjacentPairs[i][1]);
                integerIntegerHashMap1.put(adjacentPairs[i][0],linkedList);
            }else
            {
                LinkedList<Integer> linkedList1 = new LinkedList<>();
                linkedList1.addLast(adjacentPairs[i][1]);
                integerIntegerHashMap1.put(adjacentPairs[i][0],linkedList1);
            }
            if (integerIntegerHashMap1.containsKey(adjacentPairs[i][1]))
            {
                LinkedList linkedList = integerIntegerHashMap1.get(adjacentPairs[i][1]);
                linkedList.addLast(adjacentPairs[i][0]);
                integerIntegerHashMap1.put(adjacentPairs[i][1],linkedList);
            }else
            {
                LinkedList<Integer> linkedList1 = new LinkedList<>();
                linkedList1.addLast(adjacentPairs[i][0]);
                integerIntegerHashMap1.put(adjacentPairs[i][1],linkedList1);
            }

        }
        Deque<Integer>aa =new LinkedList<>();
        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integerIntegerHashMap.get(integer)==1)
            {    integers.add(integer);
                aa.addLast(integer);
                break;


            }
        }
        Integer peek = aa.peek();
        while (peek!=null)
        {
            LinkedList linkedList = integerIntegerHashMap1.get(peek);
            peek=null;
            for (Object o : linkedList) {
                if (integers.contains((int)o))
                {
                    continue;
                }else
                {
                    peek=(int)o;
                    aa.addLast(peek);
                    integers.add(peek);
                }
            }
        }
        int ap[]=new int[aa.size()];
        int l=0;
        while (!aa.isEmpty())
        {
            ap[l]=aa.removeFirst();
            l++;
        }
        return ap;
    }
}
