package Six;

import java.util.*;

public class NinetyTwo {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for (int i = 0; i <words.length ; i++) {
            stringIntegerHashMap.put(words[i],stringIntegerHashMap.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Nodes1> nodes1s = new PriorityQueue<>(new Comparator<Nodes1>() {
            @Override
            public int compare(Nodes1 o1, Nodes1 o2) {
                if (o1.b != o2.b) {
                    return o1.b - o2.b;
                } else {
                    for (int i = 0; i < Math.min(o1.a.length(), o2.a.length()); i++) {
                        if (o1.a.charAt(i) < o2.a.charAt(i)) {
                            return 1;
                        } else if (o1.a.charAt(i) == o2.a.charAt(i)) {
                            continue;
                        } else {
                            return -1;
                        }
                    }
                }
                return o2.a.length()-o1.a.length();
            }
        });
        LinkedList<String> strings = new LinkedList<>();
        for (String s : stringIntegerHashMap.keySet()) {
            if (nodes1s.size()<k)
            {
                nodes1s.add(new Nodes1(s,stringIntegerHashMap.get(s)));
            }else if (stringIntegerHashMap.get(s)>nodes1s.peek().b)
            {
                nodes1s.poll();
                nodes1s.offer(new Nodes1(s,stringIntegerHashMap.get(s)));
            }else if (stringIntegerHashMap.get(s)==nodes1s.peek().b)
            {
               nodes1s.offer(new Nodes1(s,stringIntegerHashMap.get(s)));
               nodes1s.poll();

            }else
            {
                continue;
            }
        }
        while (!nodes1s.isEmpty())
        {
            Nodes1 poll = nodes1s.poll();
            strings.addFirst(poll.a);
        }
        return strings;
    }
    class Nodes1
    {
        String a ;
        int b ;
        Nodes1(String a , int b)
        {
            this.a = a;
            this.b = b;
        }
    }
}
