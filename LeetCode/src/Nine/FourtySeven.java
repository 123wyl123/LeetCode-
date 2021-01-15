package Nine;

import java.util.HashMap;

public class FourtySeven {
    public int removeStones(int[][] stones) {
        HashMap<Integer, Node1> H = new HashMap<>();
        HashMap<Integer,Node1> W = new HashMap<>();
        HashMap<String, Node1> stringNode1HashMap = new HashMap<>();
        for (int i = 0; i <stones.length ; i++) {
            int i1 = stones[i][0];
            int i2 = stones[i][1];
            Node1 node1 = new Node1(i1, i2);
            stringNode1HashMap.put(i1+" "+i2,node1);
            node1.farther=node1;

            if (H.containsKey(i1))
            {
                Node1 node = H.get(i1);
                find(node1).farther=find(node);
            }else
            {
                H.put(i1,node1);
            }
            if (W.containsKey(i2))
            {
                Node1 node = W.get(i2);
                find(node1).farther=find(node);
            }else
            {
                W.put(i2,node1);
            }
        }
        int temp =0;
        for (int[] stone : stones) {
            int i = stone[0];
            int i1 = stone[1];
            Node1 node1 = stringNode1HashMap.get(i+" "+i1);
            if (node1.farther!=node1)
            {
                temp++;
            }
        }
        return temp;
    }

    public Node1 find(Node1 aa)
    {
        if (aa.farther!=aa)
        {
            aa.farther=find(aa.farther);
        }
        return aa.farther;
    }
    class  Node1
    {
        int a;
        int b;
        Node1 farther;
        Node1(int m,int n)
        {
            this.a = m;
            this.b = n;
        }
    }


}
