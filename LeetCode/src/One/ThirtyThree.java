package One;

import java.util.*;

class Node1 {
    public int val;
    public List<Node1> neighbors;

    public Node1() {
        val = 0;
        neighbors = new ArrayList<Node1>();
    }

    public Node1(int _val) {
        val = _val;
        neighbors = new ArrayList<Node1>();
    }

    public Node1(int _val, ArrayList<Node1> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class ThirtyThree {
    public Node1 cloneGraph(Node1 node) {
        if (node == null) return null;
        Map<Node1, Node1> resNode2CopyNode = new HashMap<>();
        Stack<Node1> stack = new Stack<>();
        stack.push(node);
        Node1 copy = new Node1();
        copy.val = node.val;
        resNode2CopyNode.put(node, copy);
        while (!stack.isEmpty()) {
            Node1 current = stack.pop();
            List<Node1> neighbors = current.neighbors;
            if (neighbors == null) {
                continue;
            }

            Node1 copyNode = resNode2CopyNode.get(current);
            if (copyNode.neighbors == null) {
                copyNode.neighbors = new LinkedList<>();
            }

            for (Node1 neior : neighbors) {
                Node1 copyNeior = null;
                if (resNode2CopyNode.containsKey(neior)) {
                    copyNeior = resNode2CopyNode.get(neior);
                } else {
                    copyNeior = new Node1();
                    copyNeior.val = neior.val;
                    resNode2CopyNode.put(neior, copyNeior);
                    stack.push(neior);
                }
                copyNode.neighbors.add(copyNeior);
            }
        }
        return copy;

    }
}
