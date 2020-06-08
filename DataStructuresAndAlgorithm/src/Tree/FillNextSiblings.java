package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FillNextSiblings {
    public static void fillNextSiblings(BinaryTreeNode root) {
        if (root == null)
            return;
        if (root.getLeft() != null)
            root.getLeft().setNextSibling(root.getRight());
        if (root.getRight() != null)
            if (root.getNextSibling() != null)
                root.getRight().setNextSibling(root.getNextSibling().getLeft());
            else root.getRight().setNextSibling(null);
        fillNextSiblings(root.getLeft());
        fillNextSiblings(root.getRight());
    }

    public static void fillNextSibling(BinaryTreeNode root) {
        BinaryTreeNode tmp = null;
        if (root == null)
            return;
        // Initialization
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            tmp = q.poll();
            if (tmp != null) {
                tmp.setNextSibling(q.peek());
                if (tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if (tmp.getRight() != null)
                    q.offer(tmp.getRight());
            } else {
                // completion of a level;
                if (!q.isEmpty())
                    q.offer(null);
            }

        }
    }



}
