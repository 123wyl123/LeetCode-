package Eight;

import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Ninety {
    public TreeNode increasingBST(TreeNode root) {
        Deque<TreeNode> a = new LinkedList<>();
        a.push(root);
        TreeNode pre=null;
        TreeNode head =null ;
        while (!a.isEmpty())
        {
            TreeNode peek = a.peek();
            while (peek.left!=null)
            {
                a.push(peek.left);
                peek.left=null;
                peek = a.peek();
            }
            if(pre==null)
            {
                pre = a.pop();
                head = pre;
            } else
            {
                pre.right = a.pop();
                pre = pre.right;
            }
            while (pre.right==null&&!a.isEmpty())
            {
                pre.right = a.pop();
                pre = pre.right;
            }
            if(pre.right!=null)
            {
                a.push(pre.right);
            }
        }
return head;
    }


}
