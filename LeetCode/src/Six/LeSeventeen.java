package Six;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LeSeventeen {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

            if (t1 == null)
                return t2;
            if (t2 == null)
                return t1;
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        }



    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.left = d;
        TreeNode a1 = new TreeNode(2);
        TreeNode b1 = new TreeNode(1);
        TreeNode c1 = new TreeNode(3);
        TreeNode d1 = new TreeNode(4);
        TreeNode e1 = new TreeNode(7);
        a1.left = b1;
        a1.right = c1;
        b1.right = d1;
        c1.right = e1;
        LeSeventeen aa = new LeSeventeen();
        aa.mergeTrees(a, a1);
    }
}
