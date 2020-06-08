package Tree;

public class SearchDelete {
    BinarySearchTreeNode FindMax(BinarySearchTreeNode root)
    {
        if(root ==null)
        {
            return null;
        }
        if(root.getRight()==null)
        {
            return root;
        }
        else {
            while (root.getRight()!=null)
            {
                root=root.getRight();
            }
            return root;
        }
    }
    BinarySearchTreeNode Delete(BinarySearchTreeNode root,int data)
    {
        BinarySearchTreeNode temp;
        if(root ==null)
        {
            System.out.println("Element not");
        }
        else if(data<root.getData())
        {
            root.left = Delete(root.getLeft(),data);
        }
        else if(data>root.getData()){
            root.right = Delete(root.getRight(),data);
        }
        else
        {
            if(root.getLeft()!=null&&root.getRight()!=null)
            {
                temp = FindMax(root.getLeft());
                root.setData(temp.getData());
               root.left= Delete(root.getLeft(),temp.getData());

            }
            else
            {
                temp = root;
                if(root.getRight()==null)
                {
                    root = root.getLeft();
                }
                else
                {
                    root = root.getRight();
                }
            }

        }
        return  root;
    }
}
