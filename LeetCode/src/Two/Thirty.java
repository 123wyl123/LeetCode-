package Two;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Thirty {
    int x, temp;

    public int kthSmallest(TreeNode root, int k) {
        x = 0;
        temp = 0;
        dps(root, k);
        return temp;
    }

    boolean dps(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        boolean left = dps(root.left, k);
        x++;
        if (x == k) {
            temp = root.val;
            return true;
        }
        if (left) {
            return true;
        }
        boolean right = dps(root.right, k);

        return false;
    }

    public int kthSmallest1(TreeNode root, int k) {
        Deque<TreeNode> a = new LinkedList<>();
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        while (root.left != null) {
            a.push(root);
            root = root.left;
        }

        while (!a.isEmpty()) {
            TreeNode pop = a.pop();
            treeNodes.add(pop);
            if (treeNodes.size() == k) {
                return treeNodes.get(treeNodes.size() - 1).val;
            }
            if (pop.right != null) {
                a.push(pop.right);
                root = pop.right;
                while (root.left != null) {
                    a.push(root);
                    root = root.left;
                }
            }
        }
        return 0;
    }
}
