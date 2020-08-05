package Three;

  class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class ThirtySeven {
      int max =0;
    public int rob(TreeNode root) {
        int[] a= dps(root);

        return Math.max(a[0],a[1]);

    }

   int[] dps(TreeNode root)
   {
    if(root==null)
    {
       return null;
    }

   int[] left=   dps(root.left);
   int [] right=   dps(root.right);
 int[] result =new int[2];

        result [0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        result [1] = left[0]+right[0]+root.val;
    return result;
   }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        treeNode.left=treeNode1;
        treeNode.right=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.right=treeNode4;
        new ThirtySeven().rob(treeNode);

    }
}
