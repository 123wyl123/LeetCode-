package One;

public class Five {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0)
        {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        for (int i = 0; i <inorder.length ; i++) {
            if (inorder[i]==preorder[0])
            {
                treeNode.left=dfs(preorder,inorder,1,i,0,i-1);
                treeNode.right=dfs(preorder,inorder,i+1,preorder.length-1,i+1,preorder.length-1);
                break;
            }
        }
        return treeNode;
    }
    public TreeNode dfs(int[] preorder ,int[]inorder,int prestart,int preend,int instart,int inend)
    {
           if (preend<prestart)
           {
               return null;
           }
           if (preend==prestart)
           {
               return new TreeNode(preorder[preend]);
           }
        TreeNode treeNode = new TreeNode(preorder[prestart]);
        for (int i = instart; i <=inend ; i++) {
            if (inorder[i]==preorder[prestart])
            {
                treeNode.left=dfs(preorder,inorder,prestart+1,prestart+i-instart,instart,i-1);
                treeNode.right=dfs(preorder,inorder,prestart+i-instart+1,preend,i+1,inend);
                break;
            }
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,2,1};
        new Five().buildTree(a,b);
    }
}
