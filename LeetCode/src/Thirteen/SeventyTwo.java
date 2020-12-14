package Thirteen;

public class SeventyTwo {
    int max =0;
    public int longestZigZag(TreeNode root) {
        if (root==null)
        {
            return 0;
        }
        dfs(root.left,true,0);
        dfs(root.right,false,0);
        return max;
    }
    public void dfs( TreeNode root ,boolean left , int k)
    {       max = Math.max(max,k);
            if (root==null)
            {
                return;
            }
            if (left)
            {
                dfs(root.right,false,k+1);
                dfs(root.left,true,0);
            }else
            {
                dfs(root.left,true,k+1);
                dfs(root.right,false,0);
            }

    }
}
