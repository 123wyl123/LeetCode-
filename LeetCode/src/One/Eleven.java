package One;

public class Eleven {
    int min;
    public int minDepth(TreeNode root) {
        min =9999;
        depth(root,0);
        return min;

    }
    public void depth(TreeNode root,int height)
    {  if(root==null)
    {
        return;
    }
    height++;
        if(root.left==null&&root.right==null)
        {
            min = Math.min(height,min);
        }


        depth(root.left,height);
        depth(root.right,height);
    }
}
