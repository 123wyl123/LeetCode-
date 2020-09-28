package Four;

import java.util.Deque;
import java.util.LinkedList;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class TwentySix {
    Deque<Node> a;

    public Node treeToDoublyList(Node root) {
        a = new LinkedList<Node>();
        if (root == null) {
            return null;
        }
        dfs(root);
        Node head = a.getFirst();
        Node pre = null;

        while (!a.isEmpty()) {
            Node node = a.removeFirst();
            node.right = a.peek();
            node.left = pre;
            pre = node;
        }
        pre.right = head;
        head.left = pre;
        return head;
    }

    void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        a.add(root);
        dfs(root.right);
    }
}
