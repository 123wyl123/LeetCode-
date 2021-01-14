package Twelve;

import java.util.*;

public class Three {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        HashMap<Integer, LinkedList<Integer>> integerLinkedListHashMap = new HashMap<>();
        for (int i = 0; i <group.length ; i++) {

                if (integerLinkedListHashMap.containsKey(group[i]))
                {
                    integerLinkedListHashMap.get(group[i]).addLast(i);
                }else
                {
                    LinkedList<Integer> integers = new LinkedList<>();
                    integers.addLast(i);
                    integerLinkedListHashMap.put(group[i],integers);
                }
        }
        Node aaa[] = new Node[n];
        int size = beforeItems.size();
        for (int i = 0; i <n ; i++) {
            aaa[i] = new Node(i,group[i],0);
        }
        for (int i = 0; i <size ; i++) {
            for (Integer integer : beforeItems.get(i)) {
                aaa[i].tete++;
                aaa[integer].integers.addLast(i);
            }
        }
        int a[] = new int[n];
        int i=0;
        boolean[] flal = new boolean[n];
        LinkedList<Integer> integers = new LinkedList<>();
        boolean flag =true;
        while (i<n)
        {
            int size1 = i;
            Set<Integer> integers1 = integerLinkedListHashMap.keySet();
            for (Integer integer : integers1) {
                flag = true;
                PriorityQueue<Node> nodes = new PriorityQueue<>(new Comparator<Node>() {
                    @Override
                    public int compare(Node o1, Node o2) {
                        return o1.tete - o2.tete;
                    }
                });
                for (Integer integer1 : integerLinkedListHashMap.get(integer)) {
                    if (flal[integer1])
                    {
                        continue;
                    }
                    nodes.add(aaa[integer1]);
                }
                LinkedList<Integer> temp = new LinkedList<>();
                while (!nodes.isEmpty())
                {
                    Node poll = nodes.poll();
                    if (poll.tete!=0)
                    {
                        for (Integer integer1 : temp) {
                            for (Integer integer2 : aaa[integer1].integers) {
                                aaa[integer2].tete++;
                            }
                        }
                        flag = false;
                        break;
                    }
                    for (Integer integer1 : poll.integers) {
                        aaa[integer1].tete--;
                    }
                    temp.addLast(poll.value);
                }
            if (nodes.size()==0&&flag)
            {
                while (temp.size()!=0)
                {
                    Integer integer1 = temp.removeFirst();
                    if (flal[integer1])
                    {
                        continue;
                    }
                    a[i]=integer1;
                    i++;
                    flal[integer1 ]=true;
                }
                integerLinkedListHashMap.put(integer,new LinkedList<>());
            }
            if (integerLinkedListHashMap.containsKey(-1))
            {
                for (Integer integer1 : integerLinkedListHashMap.get(-1)) {
                    if (flal[integer1])
                    {
                        continue;
                    }
                    if (aaa[integer1].tete==0)
                    {
                        a[i]=integer1;
                        i++;
                        for (Integer integer2 : aaa[integer1].integers) {
                            aaa[integer2].tete--;
                        }
                        flal[integer1]=true;
                    }
                }
            }
            }
            if (size1==i)
            {
                return new int[]{};
            }
        }
return a;
    }
    class Node
    {
        int value;
        LinkedList<Integer> integers = new LinkedList<>();
        int group;
        int tete;
        Node(int a, int b, int c)
        {
            this.value = a;
            this.group=b;
        }
    }
}
