package One;

public class Zero {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean dps = dps(p, q);
        return dps;
    }

    boolean dps(TreeNode a, TreeNode b) {
        if (a == null) {
            if (b != null) {
                return false;
            } else {
                return true;
            }
        } else {
            if (b == null) {
                return false;
            }
        }
        if (a.val != b.val) {
            return false;
        }
        boolean a1 = dps(a.left, b.left);
        boolean a2 = dps(a.right, b.right);
        return a1 && a2;
    }
}
