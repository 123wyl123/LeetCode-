package Fourteen;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class FourtyEight {
     int sum =0;
    public int goodNodes(TreeNode root) {

        dfs(root,-Integer.MAX_VALUE);
        return sum;
    }
    public void dfs(TreeNode root ,int a )
    {
        if (root==null)

        {
            return;
        }
        if (root.val>=a)
        {
            sum++;
            a= root.val;
        }
        dfs(root.left,a);
        dfs(root.right,a);
    }

}
