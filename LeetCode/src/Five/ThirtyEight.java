package Five;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyEight {
    Deque<TreeNode> a;

    public TreeNode convertBST(TreeNode root) {
        a = new LinkedList<>();
        dps(root);
        int ab = 0;
        while (!a.isEmpty()) {
            TreeNode pop = a.pop();
            pop.val += ab;
            ab = pop.val;
        }
        return root;
    }

    void dps(TreeNode root) {
        if (root == null) {
            return;
        }
        dps(root.left);
        a.push(root);
        dps(root.right);
        return;
    }
}
