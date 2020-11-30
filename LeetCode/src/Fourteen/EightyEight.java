package Fourteen;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class EightyEight {
    public int[] avoidFlood(int[] rains) {
        int length = rains.length;
        int a[] = new int[length];


        int ab[] = new int[length];
        int k=0;
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        Deque<Integer> Zero_Queue = new LinkedList<Integer>();
        Deque<Integer> Zero_Queue1 = new LinkedList<Integer>();
        for (int i = 0; i <length ; i++) {
            if (rains[i]==0)
            {
                Zero_Queue.addLast(i);
                continue;
            }
            if (integerIntegerHashMap.containsKey(rains[i]))
            {      if (integerIntegerHashMap.get(rains[i])!=-1)
            {   if (!Zero_Queue.isEmpty())
            {
                Integer poll = Zero_Queue.getLast();
                Integer integer = integerIntegerHashMap.get(rains[i]);

                if (poll<integer)
                {
                    return new int[]{};
                }else
                {
                    for (Integer integer1 : Zero_Queue) {
                        if (integer1>integer)
                        {poll = integer1;
                            Zero_Queue.remove(integer1);
                            break;
                        }
                    }

                }

                ab[poll] =rains[i];
                integerIntegerHashMap.put(rains[i],i);
                ab[i] = -1;
            }else
            {
                return new int[]{};
            }

            }else
            {
                ab[i] =1;
            }

            }else
            {
                integerIntegerHashMap.put(rains[i],i);
                ab[i]=-1;
            }
        }
        while (!Zero_Queue.isEmpty())
        {
            Integer poll = Zero_Queue.poll();
            ab[poll] = 1;
        }
        return ab;
    }

    public static void main(String[] args) {
        int a[] = {1,0,2,3,0,1,2};
        new EightyEight().avoidFlood(a);
    }
}
