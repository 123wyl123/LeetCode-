package CrackingTheCodingInterview;
//面试题68 - I. 二叉搜索树的最近公共祖先


public class LeSixTyOne {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left;
        TreeNode right;
        if(root==null)

        {
            return  root;
        }
        if(root==p||root==q) {
            return root;


        }
       left = lowestCommonAncestor(root.left, p, q) ;
       right =lowestCommonAncestor(root.right, p, q);
       if(left!=null&&right!=null)
       {
           return root;
       }
       else
       {
           return left!=null?left:right;
       }
    }
    public TreeNode lowestCommonAncesto(TreeNode root,TreeNode p ,TreeNode q)
    {
        if(root==null) 
        {
            return null;
        }

            if(p.val>root.val&&q.val>root.val)
            {
               return lowestCommonAncesto( root.right,p,q);
            }
            if(p.val<root.val&&q.val<root.val)

            {
                return lowestCommonAncesto(root.left,p,q);
            }
            return  root;

    }
}
