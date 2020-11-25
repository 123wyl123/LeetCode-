package Zero;

public class NinetyEight {
    public boolean isValidBST(TreeNode root) {
        if (root==null)
        {
            return true;
        }

        int[] dfs = dfs(root,Long.MAX_VALUE, true);
        if (dfs.length==1&&dfs[0]==Integer.MAX_VALUE)
        {
            return false;
        }else
        {
            return true;
        }

    }
    public int[] dfs  (TreeNode root,long farther,boolean flag )
    {
        if (root==null)
        {
            return new int[]{};
        }
       int left[] = dfs(root.left,root.val,true);
       int right[] = dfs(root.right,root.val,false);
       if (flag&&root.val>=farther||!flag&&root.val<=farther)
       {
            return new int[]{Integer.MAX_VALUE};
       }else
       {
           if (left.length==0&&right.length==0)
           {
               return new int[]{root.val,root.val};
           }else if (left.length==1&&left[0]==Integer.MAX_VALUE||right.length==1&&right[0]==Integer.MAX_VALUE)
           {
               return new int[]{Integer.MAX_VALUE};
           }else
           {
                if (left.length==0&&root.val<right[0])
                {
                        return new int[]{root.val,right[1]};
                }else if (right.length==0&&root.val>left[1])
                {

                    return new int[]{left[0],root.val};
                }else if (left.length!=0&&right.length!=0)
                {
                    if (root.val>left[1]&&root.val<right[0])
                    {
                      return new int[]{left[0],right[1]};
                    }else
                    {
                        return new int[]{Integer.MAX_VALUE};
                    }
                }else
                {
                    return new int[]{Integer.MAX_VALUE};
                }
           }
       }

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-Integer.MAX_VALUE);
        TreeNode treeNode1 = null;
        TreeNode treeNode2 = new TreeNode(Integer.MAX_VALUE);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        new NinetyEight().isValidBST(treeNode);
    }
}
