package CrackingTheCodingInterview;

class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class LeZeroFour {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return  true;
        }
        if(isBalanced(root.left)&&isBalanced(root.right))
        {

        }
        else
        {
            return  false;
        }

        if(Math.abs(depth(root.left)-depth(root.right))>1)
        {
            return false;

        }
        else {
            return true;
        }


    }
    public int depth(TreeNode root)
    {   if(root==null)
    {
        return 0;
    }
      int left =  depth(root.left);
      int right =  depth(root.right);
      return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(4);
        a.left = b;
        a.right = c;
        b.left = d;
        c.right = e;
        d.left = f;
        e.right = g;
        LeZeroFour  m = new LeZeroFour();
        m.isBalanced(a);
    }
 }
