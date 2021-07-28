package Six;

public class SeventyOne {
    int a =0;
    public int findSecondMinimumValue(TreeNode root) {
        a=root.val;
        a=dfs(root);
        return a>root.val?a:-1;
    }

    public int dfs(TreeNode root)
    {   if (root.val>a)
    {
        return root.val;
    }
       int left= dfs(root.left);
        int right =dfs(root.right);
        if (left>a&&right>a)
        {
            return Math.min(left,right);
        }else
        {
            return Math.max(left,right);
        }

    }
}
