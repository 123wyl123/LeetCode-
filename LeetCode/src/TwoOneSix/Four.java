package TwoOneSix;

import java.util.PriorityQueue;

public class Four {
    public int minimumEffort(int[][] tasks) {

        PriorityQueue<Node> nodes = new PriorityQueue<>((Node a, Node b) ->
        {
            if (a.b - a.a != b.b - b.a) {
                return b.b - b.a - (a.b - a.a);
            } else {
                return b.b - a.b;
            }
        });
        for (int i = 0; i <tasks.length ; i++) {
            nodes.add(new Node(tasks[i][0],tasks[i][1]));
        }
        int sum =0;
        int y=0;
        while (!nodes.isEmpty())
        {
            Node poll = nodes.poll();
            if (sum<poll.b)
            {
                y+=(poll.b-sum);
                sum=poll.b-poll.a;
            }else
            {
                sum=sum-poll.a;
            }
        }
        return y;
    }
class Node
{   int a;
int b;
    Node(int a ,int b)
    {
        this.a = a;
        this.b= b;
    }
}

}
