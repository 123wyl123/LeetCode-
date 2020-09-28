package One;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class Seventeen {
    public Node connect(Node root) {
        if (root==null)
        {
            return null;
        }
        Queue<Node> a  = new LinkedList<>();
        a.offer(root);
        a.offer(null);
        while (!a.isEmpty())
        {
            Node poll = a.poll();
            if (poll!=null)
            {
                if (poll.left!=null)
                {
                    a.offer(poll.left);
                }
                if (poll.right!=null)
                {
                    a.offer(poll.right);
                }
                poll.next=a.peek();
            }else
            {   if (a.isEmpty())
            {
                return root;
            }
            a.offer(null);

            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
