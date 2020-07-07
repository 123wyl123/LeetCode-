package One;

public class Tweleve {
    int temp;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
        {

            return false;
        }
        if(root.val==sum)
        {
            if(root.left==null&&root.right==null)
            {
                return true;
            }
        }
        temp =sum;
        if( rr(root.left,root.val))
        {
            return  true;
        }

        if( rr(root.right,root.val))
        {
            return  true;
        }
        return false;
    }
    public boolean rr(TreeNode root,int sum)
    {
        if(root==null)
        {
            return  false;
        }

        sum=root.val+sum;
        if(sum==temp)
        {   if(root.left==null&&root.right==null)
        {
            return true;
        }

        }

        Boolean t=  rr(root.left,sum);
        Boolean m=     rr(root.right,sum);
        return t||m;
    }

}
