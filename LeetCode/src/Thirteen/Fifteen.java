package Thirteen;

public class Fifteen {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root, null, null);
        return sum;
    }

    private void helper(TreeNode cur, TreeNode parent, TreeNode grand) {
        if(cur == null) {
            return;
        }
        if(grand!=null && (grand.val&1) == 0) {
            sum += cur.val;
        }
        helper(cur.left, cur, parent);
        helper(cur.right, cur, parent);
    }


}
