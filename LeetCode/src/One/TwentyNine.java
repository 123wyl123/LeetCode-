package One;

public class TwentyNine {
    int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        if (root != null) {
            dfs(root, root.val);
            return sum;
        } else {
            return 0;
        }


    }

    public void dfs(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            sum += val;
            return;
        }
        if (root.left != null) {
            dfs(root.left, val * 10 + root.left.val);
        }
        if (root.right != null) {
            dfs(root.right, val * 10 + root.right.val);
        }


    }
}
