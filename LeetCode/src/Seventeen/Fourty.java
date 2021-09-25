package Seventeen;


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Fourty {
    public int findDistance(TreeNode root, int p, int q) {
        if (p == q) {
            return 0;
        }
        return dfs(root, p, q, 0);
    }

    public int dfs(TreeNode root, int p, int q, int h) {
        if (root == null) {
            return -1;
        }
        h++;
        int left = dfs(root.left, p, q, h);
        int right = dfs(root.right, p, q, h);
        if (left != -1 && right != -1) {
            return left - h + right - h;
        }
        if (left != -1 && (root.val == p || root.val == q)) {
            return left - h;
        }
        if (right != -1 && (root.val == p || root.val == q)) {
            return right - h;
        }
        if (root.val == p || root.val == q) {
            return h;
        }
        return Math.max(left, right);
    }
}