package Thirteen;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Two {
    int max =0;
    int totle = 0;

    public int deepestLeavesSum(TreeNode root) {
        dps(root,0);
        return totle;
    }
    public void dps(TreeNode root,int depth)
    {
        if(root==null)
        {
            return;
        }
        if(depth>max)
        {
            max = depth;
            totle = root.val;
        }else if(depth==max)
        {
            totle +=root.val;
        }

        dps(root.left,depth+1);
        dps(root.right,depth+1);
        return;
    }

}
