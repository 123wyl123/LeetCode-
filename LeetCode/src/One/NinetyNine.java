package One;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NinetyNine {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer>a = new LinkedList<Integer>();
        if(root==null)
        {
            return a;
        }
        queue.offer(root);
        while(queue.size()!=0)
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node= queue.poll() ;
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
                if(i==size-1)
                {
                    a.add(node.val);
                }
            }
        }
        return a;
    }
}