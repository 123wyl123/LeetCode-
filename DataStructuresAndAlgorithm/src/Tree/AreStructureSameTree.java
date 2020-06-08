package Tree;

public class AreStructureSameTree {
    Boolean AreSameTree(BinaryTreeNode root1,BinaryTreeNode root2)
    {
        if(root1 == null && root2==null)
        {
            return  true;
        }
        if(root1 == null || root2 == null)
        {
            return  false;
        }
      return (root1.getData()== root2.getData()&&AreSameTree(root1.getLeft(),root2.getLeft())&&AreSameTree(root1.getRight(),root2.getRight()));


    }
}
