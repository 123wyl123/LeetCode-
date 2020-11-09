package Nine;

import java.util.PriorityQueue;

public class SeventyThree {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Node> nodes = new PriorityQueue<Node>(
                (Node a,Node b)->
                {
                    if (a.a*a.a+a.b*a.b>b.a*b.a+b.b*b.b)
                    {
                        return -1;
                    }else
                    {
                        return 1;
                    }
                }

        );
        for (int i = 0; i <points.length ; i++) {
            if (nodes.size()<K)
            {
                nodes.add(new Node(points[i][0],points[i][1]));
            }else
            {
                Node peek = nodes.peek();
                if (peek.a*peek.a+peek.b*peek.b>points[i][0]*points[i][0]+points[i][1]*points[i][1])
                {
                    nodes.poll();
                    nodes.add(new Node(points[i][0],points[i][1]));
                }
            }
        }
        int[][] ints = new int[K][2];
        for (int i = 0; i <K ; i++) {
            Node poll = nodes.poll();
            ints[i][0] = poll.a;
            ints[i][1] = poll.b;
        }
        return ints;
    }

    public static void main(String[] args) {
       int a[][] = {{-5,4},{-6,-5},{4,6}};
        new SeventyThree().kClosest(a,2);
    }

}
class Node
{
    int a;
    int b;
    Node(int a, int b)
    {
        this.a = a;
        this.b  =b;
    }
}
