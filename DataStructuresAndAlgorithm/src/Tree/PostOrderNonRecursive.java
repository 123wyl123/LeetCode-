package Tree;

import java.util.Stack;

public class PostOrderNonRecursive {
    //Two Stack
//    void  PostOederF(BinaryTreeNode root) {
//        Stack<BinaryTreeNode> b = new Stack<BinaryTreeNode>();
//        while (true) {
//            while (root != null) {
//
//                b.push(root);
//                root = root.getRight();
//            }
//            if (b.isEmpty()) {
//                break;
//            }
//            root = b.pop();
//            root = root.getLeft();
//
//        }
//    }
    void  PostOrderT(BinaryTreeNode root)
    {   if(root ==null)
    {
        return ;
    }
        Stack<BinaryTreeNode> s1 = new Stack();
        Stack<BinaryTreeNode> s2 = new Stack();
        s1.push(root);
        while (!s1.isEmpty())
        {
            root = s1.pop();
            s2.push(root);
            if(root.getLeft()!=null)
            {
                s1.push(root.getLeft());
            }
            if(root.getRight()!=null)
            {
                root.getRight();
            }

        }
        while (!s2.isEmpty())
        {   root = s2.pop();
            System.out.println(root.getData());
        }
    }
    void PostOrder(BinaryTreeNode root)
    {
        Stack<BinaryTreeNode> a = new Stack<>();
        while (true)
        {   while (root!=null)
        {
            a.push(root);
            root = root.getLeft();
        }
            root = a.peek();
            if(root.getRight()==null)
            {
                System.out.println(root.getData());
                a.pop();
                if(a.peek().getRight()==root)
                {
                    System.out.println(a.peek().getData());
                    a.pop();
                }
            }
            root = root.getRight();
            a.push(root);

        }

    }

    public static void main(String[] args) {


    }

}
