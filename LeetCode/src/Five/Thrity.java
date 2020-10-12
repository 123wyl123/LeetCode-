package Five;

public class Thrity {
    TreeNode pre;
    int min;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = new TreeNode(-99999);
        dfs(root);
        return min;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        min = Math.min(root.val - pre.val, min);
        pre = root;
        dfs(root.right);
    }
}
