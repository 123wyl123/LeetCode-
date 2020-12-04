package Thirteen;

public class ThirtyNine {
    long sum =0;
    long temp =0;
    public int maxProduct(TreeNode root) {
        dfs(root);
        dfs1(root);
        return (int)(temp%1000000007);
    }
    public  void   dfs(TreeNode root)
    {   if (root==null)
    {
        return ;
    }
        sum+=root.val;
        dfs(root.left);
        dfs(root.right);
    }
    public int dfs1(TreeNode root   )
    {
        if (root==null)
        {
            return 0;
        }
        int left = dfs1(root.left);

        int right = dfs1(root.right);

        int susu = left+right+root.val;
        temp = Math.max(temp,susu*(sum-susu));
        return susu;
    }
}
