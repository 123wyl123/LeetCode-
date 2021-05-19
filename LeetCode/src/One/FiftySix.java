package One;

public class FiftySix {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        TreeNode parent = null, parent_right = null;
        while (root != null) {
            TreeNode root_left = root.left;
            root.left = parent_right;
            parent_right = root.right;
            root.right = parent;
            parent = root;
            root = root_left;
        }
        return parent;
    }

}