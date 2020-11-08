package One;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Two {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
        {
         return new LinkedList<>();
        }
        Queue<TreeNode> a  =  new LinkedList<TreeNode>();
        a.offer(root);
        List<List<Integer>> b = new LinkedList<>();
        while (!a.isEmpty())
        {
            int size = a.size();
            LinkedList<Integer> treeNodes = new LinkedList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode poll = a.poll();
                if (poll.left!=null)
                {
                    a.offer(poll.left);
                }
                if (poll.right!=null)
                {
                    a.offer(poll.right);
                }
                treeNodes.add(poll.val);
            }
            b.add(treeNodes);
        }
        return b;
    }
}
