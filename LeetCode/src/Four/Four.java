package Four;

public class Four {
    int result;

    public int sumOfLeftLeaves(TreeNode root) {
        result = 0;
        if (root == null||root.left == null && root.right == null ) {
            return 0;
        }

        dps(root, null);
        return result;
    }

    void dps(TreeNode root, TreeNode farther) {
        if (root == null) {
            return;
        }
        dps(root.left, root);
        dps(root.right, root);
        if (root.left == null && root.right == null) {
            if (root == farther.left) {
                result += root.val;
            }
        }
    }
}
