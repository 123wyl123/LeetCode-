package Eight;

public class Fourteen {
    public TreeNode pruneTree(TreeNode root) {
       boolean b= dfs(root);
        return b?root:null;
    }
    public  boolean  dfs(TreeNode root)
    {
        if (root==null)
        {
            return false;
        }
        boolean left = dfs(root.left);
        if (left==false)
        {
            root.left=null;
        }
        boolean right = dfs(root.right);
        if (right==false)
        {
            root.right=null;
        }
        if (root.val==1)
        {
            return true;
        }else
        {
            return left||right;
        }
    }
}
