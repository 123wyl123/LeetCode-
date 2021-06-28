package Eight;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Fifteen {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer, Node> integerNodeHashMap = new HashMap<>();

        for (int i = 0; i <routes.length ; i++) {
            int[] route = routes[i];
            for (int j = 0; j <route.length ; j++) {
                Node a =null;
                if (integerNodeHashMap.containsKey(route[j]))
                {
                    a=integerNodeHashMap.get(route[j]);
                    a.b.addLast(i);
                    integerNodeHashMap.put(route[j],a);
                }else
                {
                    Node node = new Node(route[j]);
                    node.b.addLast(i);
                    integerNodeHashMap.put(route[j],node);
                    a= node;

                }
            }
        }
        HashSet<Integer> integers1 = new HashSet<>();
        Deque<Node> aa =new LinkedList<>();
        HashSet<Integer> integers = new HashSet<>();
        Node node = integerNodeHashMap.get(source );
        for (Integer integer : node.b) {
            integers1.add(integer);
            int[] route = routes[integer];
            for (int i : route) {
                if (integers.contains(i))
                {

                }else
                {   integers.add(i);
                    aa.offer(integerNodeHashMap.get(i));
                }

            }

        }



        if (integers.contains(target))
        {   if (source==target)
        {
            return 0;
        }
            return 1;
        }
        int temp=0;
        while (!aa.isEmpty())
        {   temp++;
            int size = aa.size();
            for (int i = 0; i <size ; i++) {
                Node poll = aa.poll();
                for (Integer integer : poll.b) {
                    if (integers1.contains(integer))
                    {
                        continue;
                    }
                    integers1.add(integer);
                    for (int j = 0; j <routes[integer].length ; j++) {
                        if (integers.contains(routes[integer][j]))
                        {
                            continue;
                        }else
                        {
                            integers.add(routes[integer][j]);
                            aa.offer(integerNodeHashMap.get(routes[integer][j]));
                        }
                        if (integers.contains(target))
                        {
                            return temp+1;
                        }
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
class Node
{
    int a;
    LinkedList<Integer> b;
    Node(int a)
    {
        this.a = a;
        this.b=new LinkedList<Integer>();
    }
}
