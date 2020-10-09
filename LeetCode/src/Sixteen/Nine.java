package Sixteen;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
     int val;
   TreeNode left;
   TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Nine {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean  flag = true;
        while (!queue.isEmpty())
        {   TreeNode pre = flag?new TreeNode(0):new TreeNode(1000002);
            int size = queue.size();
            for (int i = 0; i <size ; i++) {

                TreeNode poll = queue.poll();
                if (poll.left!=null)
                {
                    queue.offer(poll.left);
                }
                if (poll.right!=null)
                {
                    queue.offer(poll.right);
                }
                if (pre!=null)
                {
                    if (flag)
                    {   if (poll.val%2==0)
                    {
                        return false;
                    }
                        if (pre.val<poll.val)
                        {
                            pre = poll;
                        }else
                        {
                            return false;
                        }
                    }else
                    { if (poll.val%2==1)
                    {
                        return false;
                    }
                        if (pre.val>poll.val)
                        {
                            pre = poll;
                        }else
                        {
                            return false;
                        }
                    }
                }else
                {    if (flag)
                {
                    if (poll.val%2==0)
                    {
                        return false;
                    }
                }else
                {
                    if (poll.val%2==1)
                    {
                        return false;
                    }
                }
                    pre = poll;
                }
            }
            flag = flag==true?false:true;

        }
    return true;
    }

}
