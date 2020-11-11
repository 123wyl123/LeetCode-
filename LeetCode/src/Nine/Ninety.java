package Nine;

import java.util.*;

public class Ninety {
    public Node cloneTree(Node root) {
        if (root==null)
        {
            return null;
        }
        Node node = new Node(root.val,new ArrayList<Node>());
        HashMap<Node, Node> nodeNodeHashMap = new HashMap<>();
        Queue<Node> a = new LinkedList<>();
        nodeNodeHashMap.put(root,node);
        a.add(root);
        while (!a.isEmpty())
        {
            Node poll = a.poll();
            Node node1 = nodeNodeHashMap.get(poll);

            for (Node child : poll.children) {
                a.offer(child);
                Node node2 = new Node(child.val, new ArrayList<Node>());
                nodeNodeHashMap.put(child,node2);
                node1.children.add(node2);
            }
        }
        return node;

    }
    class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val,ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
