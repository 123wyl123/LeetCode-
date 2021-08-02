package Seven;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class SeventyFourThree {
    public int networkDelayTime(int[][] times, int n, int k) {



        HashMap<Integer,Node> node= new HashMap<Integer,Node>();
        for(int i=0;i<times.length;i++)
        {
            Node temp= node.getOrDefault(times[i][0],new Node(times[i][0],0));
            Node temp1= node.getOrDefault(times[i][1],new Node(times[i][1],0));
            temp.b.put(temp1, times[i][2]);
            node.put(times[i][0], temp);
            node.put(times[i][1],temp1);
        }
        HashSet <Node> bb=     new HashSet<>();
        Node  die=  node.get(k);
        Deque<Node> stk = new LinkedList<>();
        stk.add(die);
        int max =0;
        HashSet<Node> nodeHashMap = new HashSet<>();
        while(stk.size()!=0)
        {
            int size=stk.size();
            for(int i=0;i<size;i++)
            {
                Node curr= stk.poll();


                bb.add(curr);
                nodeHashMap.add(curr);
                for(Node tempf: curr.b.keySet())
                {
                    if(bb.contains(tempf))
                    {
                        if(tempf.c>curr.c+curr.b.get(tempf))
                        {
                            tempf.c=curr.c+curr.b.get(tempf);
                            stk.add(tempf);

                            bb.remove(tempf);
                        }
                    }else
                    {
                        if (nodeHashMap.contains(tempf))
                        {
                            tempf.c=Math.min(tempf.c,curr.c+curr.b.get(tempf));

                        }else
                        {
                            tempf.c=curr.c+curr.b.get(tempf);
                        }

                        stk.add(tempf);
                    }
                    nodeHashMap.add(tempf);
                }

            }

        }
        for(Node cc:bb)
        {
            max =Math.max(max,cc.c);
        }
        if(bb.size()==n)
        {
            return max;
        }
        return -1;

    }

    class Node
    {
        int a;
        HashMap<Node,Integer> b = new HashMap<Node,Integer>();
        int c;
        Node(int a,int c)
        {
            this.a=a;
            this.c=c;
        }
    }
}