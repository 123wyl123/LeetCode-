package One;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Node2[] nodes = new Node2[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node2();
            nodes[i].id = i;
            nodes[i].p = 0;
        }
        for (int i = 0; i < edges.length; i++) {
            Node2 a = nodes[edges[i][0]];
            Node2 b = nodes[edges[i][1]];
            Edge e = new Edge();
            e.a = a;
            e.b = b;
            e.p = succProb[i];
            a.adj.add(e);
            b.adj.add(e);
        }
        TreeSet<Node2> set = new TreeSet<Node2>((a, b) -> a.p == b.p ? Integer.compare(a.id, b.id) : -Double.compare(a.p, b.p));
        nodes[start].p = 1;
        set.add(nodes[start]);
        while (!set.isEmpty()) {
            Node2 head = set.pollFirst();
            for (Edge e : head.adj) {
                Node2 node = e.other(head);
                double p = head.p * e.p;
                if (node.p < p) {
                    set.remove(node);
                    node.p = p;
                    set.add(node);
                }
            }
        }
        return nodes[end].p;
    }

}

class Edge {
    Node2 a;
    Node2 b;
    double p;
    public Node2 other(Node2 x) {
        return a == x ? b : a;
    }
}

class Node2 {
    double p;
    List<Edge> adj = new ArrayList<Edge>();
    int id;
}
