package Tree;

public class PrintAllAncestors {
    int PrintAllAncestors(BinaryTreeNode root,BinaryTreeNode node)
    {
        if(root == null)
            return 0;
        if(root.getLeft()==node||root.getRight()==node||PrintAllAncestors(root.getLeft(),node)==1||PrintAllAncestors(root.getRight(),node)==1)
        {
            System.out.println(root.getData());
            return  1;

        }
    return  0 ;
    }

}
