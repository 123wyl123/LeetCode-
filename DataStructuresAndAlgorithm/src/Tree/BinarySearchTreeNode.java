package Tree;

public class BinarySearchTreeNode {
    public int data;
    public BinarySearchTreeNode left;
    public BinarySearchTreeNode right;

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }

    public BinarySearchTreeNode getRight() {
        return this.right;
    }

    public BinarySearchTreeNode getLeft() {
        return this.left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

}
