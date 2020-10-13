package TwoOneZero;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Two {
    public int maximalNetworkRank(int n, int[][] roads) {
        if (roads.length==0||n==0)
        {
            return 0;
        }
        HashMap<Integer, Node> integerNodeHashMap = new HashMap<>();
        for (int i = 0; i <roads.length ; i++) {
            int i1 = roads[i][0];
            int i2 = roads[i][1];
            Node node1;
            Node node2;
            if (integerNodeHashMap.containsKey(i1))
           {
                node1 = integerNodeHashMap.get(i1);
           }else
           {
             node1 = new Node(i1);
             integerNodeHashMap.put(i1,node1);
           }
            if (integerNodeHashMap.containsKey(i2))
            {
                node2 = integerNodeHashMap.get(i2);
            }else
            {
                node2 = new Node(i2);
                integerNodeHashMap.put(i2,node2);
            }
            node1.next.add(node2);
            node2.next.add(node1);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(integerNodeHashMap.get(roads[0][1]));
        int pre =0;
        int max = 0;
        boolean aa[] = new boolean[n];
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {

                Node node = integerNodeHashMap.get(i);
                Node node1 = integerNodeHashMap.get(j);
                if (node==null)
                {
                    break;
                }
                if (node1==null)
                {
                    continue;
                }
                int size=0;
                int size1=0;
                if (node.next!=null)
                {
                    size = node.next.size();
                    if (node1.next!=null)
                    {
                        size1 = node1.next.size();
                        max = Math.max(max,  node.next.contains(node1)?size+size1-1:size+size1);
                    }else
                    {
                        max = Math.max(max,size);
                    }
                }else
                {
                    if (node1.next!=null)
                    {
                        max = Math.max(max,node1.next.size());
                    }
                }



            }
        }
        return max;
    }
    class Node{
        LinkedList<Node> next;
        int val;
        public Node(int val)
        {
            this.val= val;
            this.next = new LinkedList<>();
        }

    }


}
