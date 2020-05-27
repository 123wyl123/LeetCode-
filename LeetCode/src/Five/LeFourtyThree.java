package Five;
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class LeFourtyThree {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {


        diameter(root);
        return diameter;
    }
    public int diameter(TreeNode root)
    {
        int left,right;
        if(root==null)
        {
            return 0;
        }
        left = diameter(root.left);
        right= diameter(root.right);
        if(left+right>diameter)
        {
            diameter= left+right;
        }
        return Math.max(left,right)+1;
    }
}

