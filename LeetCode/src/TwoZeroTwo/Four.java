package TwoZeroTwo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Four {
    HashMap<Integer, Integer> integerIntegerHashMap;
    Queue<Integer> a;
    public int minDays(int n) {
     integerIntegerHashMap = new HashMap<>();
       a = new LinkedList<>();
        if(n==1)
        {
            return 1;
        }
        a.offer(n);
        integerIntegerHashMap.put(n,1);
        while (!a.isEmpty())
        {
            Integer poll = a.poll();
            if(poll==1)
                return integerIntegerHashMap.get(poll);
            extend(integerIntegerHashMap.get(poll),poll-1);
            if(poll%2==0)
            {
                extend(integerIntegerHashMap.get(poll),poll/2);
            }
            if(poll%3==0)
            {
                extend(integerIntegerHashMap.get(poll),poll/3);
            }

        }
    return -1;
    }
    public void extend(int dist,int x)
    {
        if(integerIntegerHashMap.containsKey(x))
        {
            return;
        }
        integerIntegerHashMap.put(x,dist+1);
        a.offer(x);
    }

}
