package LCP;

import java.util.Deque;
import java.util.LinkedList;

public class Seven {
    public int numWays(int n, int[][] relation, int k) {
        Node a[]=new Node[n];
        for (int i = 0; i <n ; i++) {
            a[i]=new Node(i);
        }
        for (int i = 0; i <relation.length ; i++) {
            int[] ints = relation[i];
            a[ints[0]].b.addLast(a[ints[1]]);
        }
        Deque<Node> c = new LinkedList<>();
        c.offer(a[0]);
        for (int i = 0; i <k ; i++) {
            int size = c.size();
            for (int j = 0; j <size ; j++) {
                Node poll = c.poll();
                for (Node node : poll.b) {
                    c.offer(node);
                }
            }
        }
        int temp=0;
        for (Node node : c) {
            if (node.a==n-1)
            {
                temp++;
            }
        }
        return temp;
    }
    class Node
    {
        int a;
        LinkedList<Node> b;
        Node(int a)
        {
            this.a=a;
            this.b = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        int a[][]={{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        new Seven().numWays(5,a,3);
    }
}
