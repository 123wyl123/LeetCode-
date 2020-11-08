package One;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Three {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null)
        {
            return new LinkedList<>();
        }
        Deque<TreeNode> a  =  new LinkedList<TreeNode>();
        a.offer(root);
        List<List<Integer>> b = new LinkedList<>();
        boolean ab = true;
        while (!a.isEmpty())
        {
            int size = a.size();
            LinkedList<Integer> integers = new LinkedList<>();
            for (int i = 0; i <size ; i++) {
                if (ab)
                {
                    TreeNode poll = a.removeFirst();
                    if (poll.left!=null)
                    {
                        a.addLast(poll.left);
                    }
                    if (poll.right!=null)
                    {
                        a.addLast(poll.right);
                    }
                    integers.add(poll.val);
                }else
                {
                    TreeNode treeNode = a.removeLast();
                    if (treeNode.right!=null)
                    {
                        a.addFirst(treeNode.right);
                    }
                    if (treeNode.left!=null)
                    {
                        a.addFirst(treeNode.left);
                    }
                    integers.add(treeNode.val);
                }
            }
            b.add(integers);
            ab = !ab;
        }
return b;
    }

}
