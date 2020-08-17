package One;

public class Ten {
    boolean a ;
    public boolean isBalanced(TreeNode root) {
        a =true;
        dps(root,0);
        return a;

    }
    public int   dps(TreeNode root,int height)
    {
        if(root==null)
        {
            return 0;
        }
        int left = dps(root.left, height );
        int right = dps(root.right, height );
        if(Math.abs(left-right)>1)
        {
            a = false;
            return 0;
        }
        return Math.max(left,right)+1;

    }
}
