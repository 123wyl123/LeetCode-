package Two;

public class TwentySix {
    public TreeNode invertTree(TreeNode root) {
        d(root);
        return root;
    }

    public TreeNode d(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode d = d(root.left);
        TreeNode d1 = d(root.right);

        root.left = d1;
        root.right = d;
        return root;

    }
}
