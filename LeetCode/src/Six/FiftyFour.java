package Six;

public class FiftyFour {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0)
        {
            return null;
        }
        int max = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>nums[max])
            {
                max = i;
            }
        }
        TreeNode treeNode = new TreeNode(nums[max]);
        treeNode.left=dfs(0,max-1,nums);
        treeNode.right = dfs(max+1,nums.length-1,nums);
        return treeNode;
    }
    public TreeNode dfs(int l,int r,int a[] )
    {
        if (l==r)
        {
            return new TreeNode(a[r]);
        }else if (l>r)
        {
            return null;
        }
        int max = l;
        for (int i = l; i <=r ; i++) {
            if (a[i]>a[max])
            {
                max = i;
            }
        }
        TreeNode treeNode = new TreeNode(a[max]);
        treeNode.left= dfs(l,max-1,a);
        treeNode.right=dfs(max+1,r,a);
        return treeNode;
    }
}
