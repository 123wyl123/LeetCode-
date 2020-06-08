package Tree;

import java.util.Stack;

public class InOrder {
    public void InorderRecursive(BinaryTreeNode root)
    {
        Stack <BinaryTreeNode> a = new Stack<>();
        while (true)
        {   BinaryTreeNode temp = null;
            BinaryTreeNode pre = null;
            while (root!=null)
            {   a.push(root);
                root = root.getLeft();
            }
            root = a.pop();
            System.out.println(pre.getData());
            root = root.getRight();
            if(a.isEmpty()&&root==null)
            {
                break;
            }
        }
    }
}
