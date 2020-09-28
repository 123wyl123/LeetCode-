package Two;

public class ThirtyFive {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)
        {
            return null;
        }
        if (root==p||root==q)
        {
            return root;
        }
      return   dps(root,p,q);

    }
    TreeNode dps(TreeNode root, TreeNode p ,TreeNode q)
    {   if (root==null) {;
        return null;
    }
        if (root==p||root==q)
        {
            return root;
        }
     TreeNode left=   dps(root.left,p,q);
     TreeNode right=   dps(root.right,p,q);
     if (left!=null &&right!=null)
     {
         return root;
     }else if (left!=null&&right==null)
     {
         return left;
     }else
     {
         return right;
     }
    }
}
