package Zero;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class FiftySix {
    public int[][] merge(int[][] intervals) {
        if (intervals.length==0)
        {
            return intervals;
        }
        PriorityQueue<Node> nodes = new PriorityQueue<>((Node a, Node b) ->
        {   if (a.a<b.a)
        {
            return -1;
        }else if (a.a==b.a)
        {
            return b.a-a.a;
        }else
        {
            return 1;
        }

        });
        for (int i = 0; i <intervals.length ; i++) {
            nodes.add(new Node(intervals[i][0],intervals[i][1]));
        }

        LinkedList<Node> nodes1 = new LinkedList<>();
        Node poll = nodes.poll();
        int before = poll.a;
        int after = poll.b;
        while (!nodes.isEmpty())
        {
            if (nodes.peek().a<=after)
            {
                Node poll1 = nodes.poll();
                after= Math.max(after,poll1.b);
            }else
            {     Node poll1 = nodes.poll();
                nodes1.add(new Node(before,after));
                before = poll1.a;
                after = poll1.b;
            }
        }
        nodes1.add(new Node(before,after));
        int a[][] = new int[nodes1.size()][2];
        for (int i = 0; i <a.length ; i++) {
            a[i][0] = nodes1.get(i).a;
            a[i][1] = nodes1.get(i).b;
        }
        return a;
    }
}
class  Node
{
    int a;
    int b;
    Node(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
}
