package Thirteen;

public class TwentyFive {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return   dfs(root,target);

    }
    public TreeNode dfs(TreeNode root ,int target)
    {   if (root==null)
    {
        return root;
    }
        TreeNode left = dfs(root.left,target);
        TreeNode right =  dfs(root.right,target);
        root.left = left;
        root.right=right;
        if (left==null&&right==null)
        {
            if (root.val==target)
            {
                root=null;
                return null;
            }
        }
        return  root;
    }
}


