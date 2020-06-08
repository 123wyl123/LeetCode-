package Tree;

import java.util.Stack;

class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private BinaryTreeNode nextSibling;
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public BinaryTreeNode getLeft() {
        return this.left;
    }

    public BinaryTreeNode getRight() {
        return this.right;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    public void setNextSibling(BinaryTreeNode nextSibling)
    {
        this.nextSibling = nextSibling;
    }
    public BinaryTreeNode getNextSibling()
    {
        return  this.nextSibling;
    }
}

public class PreOrderNonRecurisive {
    void PreOrder(BinaryTreeNode a) {
        Stack<BinaryTreeNode> b = new Stack<BinaryTreeNode>();
        while (true) {
            while (a != null) {
                System.out.println(a.getData());
                b.push(a);
                a = a.getLeft();
            }
            if (b.isEmpty()) {
                break;
            }
            a = b.pop();
            a = a.getRight();

        }
    }
}
