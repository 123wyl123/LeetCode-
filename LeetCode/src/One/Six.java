package One;

public class Six {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int length = postorder.length;
        if (length==0){
            return  null;
        }
        int root =postorder[length-1];
        int i;
        for ( i = 0; i <inorder.length ; i++) {
            if (inorder[i]==root)
            {
                break;
            }
        }
        TreeNode treeNode = new TreeNode(root);
        treeNode.left = dps(inorder,0,i-1,postorder,0,i-1);
        treeNode.right =dps(inorder,i+1,length-1,postorder,i,length-2);
        return treeNode;


    }
    TreeNode dps(int [] inorder,int begin,int end,int [] postorder,int begin1, int end1)
    {   if (begin>=end)
    {
        return begin>end?null:new TreeNode(inorder[begin]);
    }
        int j ;
        for ( j = begin; j <end ; j++) {
            if (inorder[j]==postorder[end1])
            {
                break;
            }
        }
        int root =postorder[end1];
        TreeNode treeNode = new TreeNode(root);
        treeNode.left = dps(inorder,begin,j-1,postorder,begin1,begin1+j-1-begin);
        treeNode.right =dps(inorder,j+1,end,postorder,begin1+j-begin,end1-1);
        return treeNode;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {4,3,2,1};
        new Six().buildTree(a,b);
    }
}
