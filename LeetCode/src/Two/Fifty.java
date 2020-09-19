package Two;

public class Fifty {
    int a;

    public int countUnivalSubtrees(TreeNode root) {
        a = 0;
        dps(root);
        return a;
    }

    boolean dps(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = dps(root.left);
        boolean right = dps(root.right);
        if (left && right) {
            if (root.left != null && root.right != null && root.left.val == root.val && root.right.val == root.val) {
                a++;
                return true;
            } else if (root.left != null && root.right == null && root.left.val == root.val) {
                a++;
                return true;
            } else if (root.right != null && root.left == null && root.right.val == root.val) {
                a++;
                return true;
            } else if (root.left == null && root.right == null) {
                a++;
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.right = treeNode5;
        new Fifty().countUnivalSubtrees(treeNode);
    }
}
