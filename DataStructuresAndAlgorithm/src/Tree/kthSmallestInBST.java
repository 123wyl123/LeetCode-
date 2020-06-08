package Tree;

public class kthSmallestInBST {
    BinarySearchTreeNode kthSmallestInBST(BinarySearchTreeNode root, int k,int count)
    {
        if(root==null)
        {
            return  null;
        }
        BinarySearchTreeNode left = kthSmallestInBST(root.getLeft(),k,count);
        if(left!=null)
        {
            return left;
        }

        if(++k==count)
        {
            return  root;
        }
    return  kthSmallestInBST(root.getRight(),k,count);
    }

}
