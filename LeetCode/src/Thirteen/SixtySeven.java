package Thirteen;

import java.util.Deque;
import java.util.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class SixtySeven {
    public boolean isSubPath(ListNode head, TreeNode root) {

        Deque<TreeNode> a = new LinkedList<>();
        a.push(root);
        while (!a.isEmpty())
        {
            TreeNode pop = a.pop();
            if (pop==null)
            {
                continue;
            }
            if (pop.val==head.val&&dfs(pop,head.next))
            {
                return true;
            }else
            {
                a.push(pop.right);
                a.push(pop.left);
            }

        }
        return false;
    }
    public boolean dfs(TreeNode root,ListNode head)
    {      if (root==null)
    {
        return false;
    }
        if (head==null)
    {
        return true;
    }
        boolean left=false;
        boolean right =false; ;
           if (root.left!=null&&root.left.val==head.val)
           {
           left= dfs(root.left,head.next);
           }

        if (root.right!=null&&root.right.val==head.val)
        {
       right=   dfs(root.right,head.next);
        }
        return left||right;
    }
}
