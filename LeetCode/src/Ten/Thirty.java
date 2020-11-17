package Ten;

import java.util.PriorityQueue;

public class Thirty {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        PriorityQueue<Node> nodes = new PriorityQueue<>((Node a, Node b) ->
        {
            if (Math.abs(a.a - r0) + Math.abs(a.b - c0) < Math.abs(b.a - r0) + Math.abs(b.b - c0)) {
                return -1;
            } else {
                return 1;
            }
        });
        for (int i = 0; i <R ; i++) {
            for (int j = 0; j <C ; j++) {
                     nodes.add(new Node(i,j));
            }
        }
        int a[][] = new int[R*C][2];
        for (int i = 0; i <a.length ; i++) {
            Node poll = nodes.poll();
            a[i][0]=poll.a;
            a[i][1] =poll.b;
        }
return a;
    }
    class Node
    {
        int a;
        int b;
        Node(int a ,int b)
        {
            this.a = a;
            this.b = b;

        }
    }
}
