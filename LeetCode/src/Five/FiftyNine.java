package Five;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class FiftyNine {
    public int maxDepth(Node root) {
        int height = 0;
        Queue<Node> a = new LinkedList<>();
        a.offer(root);
        a.offer(null);
        while (!a.isEmpty())
        {
            Node pop = a.poll();
            if(pop==null)
            {
                height++;
                if(!a.isEmpty())
                {
                    a.offer(null);
                }

            } else
            {
                List<Node> children = pop.children;
                if(children!=null)
                {
                    for (Node node : children) {
                        a.offer(node);
                    }

                }

            }



        }
    return height;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(node2);
        nodes.add(node1);
        nodes.add(node3);
        node.children = nodes;
        LinkedList<Node> nodes1 = new LinkedList<>();
        nodes1.add(node5);
        nodes1.add(node4);
        node1.children = nodes1;
        new FiftyNine().maxDepth(node);
    }

}
