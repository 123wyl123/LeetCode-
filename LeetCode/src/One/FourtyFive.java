package One;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FourtyFive {
    LinkedList<Integer> a;

    public List<Integer> postorderTraversal(TreeNode root) {
        a = new LinkedList<>();
        if (root == null) {
            return a;
        }
        dfs(root);
        return a;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        a.add(root.val);
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        a = new LinkedList<>();
        if (root == null) {
            return a;
        }
        TreeNode pre = root;
        TreeNode cur = null;
        Deque<TreeNode> b = new LinkedList<>();
        b.push(root);
        while (!b.isEmpty()) {
            cur = b.peek();
            if (cur.left != null && pre != cur.left && pre != cur.right) {
                b.push(cur.left);
            } else {
                if (cur.right != null && pre != cur.right) {
                    b.push(cur.right);
                } else {
                    TreeNode pop = b.pop();
                    a.add(pop.val);
                    pre = pop;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.right = treeNode1;
        treeNode1.left = treeNode2;
        new FourtyFive().postorderTraversal1(treeNode);
    }
}
