package Two;

import java.util.LinkedList;
import java.util.Queue;

public class Seven {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]temp = new int[numCourses];
        Node[] nodes = new Node[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            nodes[i]=new Node(i);
        }
        for (int i = 0; i <prerequisites.length ; i++) {
            (nodes[prerequisites[i][0]].t)++;
            edge edge = new edge();
            edge.a=nodes[prerequisites[i][0]];
            edge.b = nodes[prerequisites[i][1]];
            nodes[prerequisites[i][1]].edges.add(edge);
        }
        Queue<Node> a = new LinkedList<>();
        Queue<Node> b = new LinkedList<>();

        for (int i = 0; i <numCourses ; i++) {

            if(nodes[i].t==0)
            {
                a.offer(nodes[i]);
            }

        }
        while (!a.isEmpty())
        {
            Node poll = a.poll();
            b.offer(poll);
            for (edge edges : poll.edges) {
                nodes[edges.other(poll).val].t--;
                if(nodes[edges.other(poll).val].t==0)
                {
                    a.offer(nodes[edges.other(poll).val]);
                }
            }

        }
        if(b.size()==numCourses)
        {
            return true;
        }
        return false;
    }

}
class Node
{   int t;
    int val;
    LinkedList<edge>edges=new LinkedList<>();
    public Node(int val)
    {
        this.val=val;
    }
}
class edge
{
    Node a;
    Node b;
    public Node other(Node x)
    {
        return a==x?b:a;
    }
}