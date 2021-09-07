package Two;

public class ThirtySix {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return dfs(root,p,q);
    }

    public TreeNode dfs(TreeNode root, TreeNode p , TreeNode q)
    {
        if(root==null)
        {
            return null;
        }
        if(root==p||root==q)
        {
            return root;
        }
        TreeNode left= dfs(root.left,p,q);
        TreeNode right= dfs(root.right,p,q);
        if(left!=null&&right!=null)
        {
            return root;
        }
        if(left!=null)
        {
            return left;
        }
        if(right!=null)
        {
            return right;
        }
        return null;
    }
}