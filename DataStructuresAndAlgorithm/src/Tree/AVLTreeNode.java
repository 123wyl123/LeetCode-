package Tree;

public class AVLTreeNode {
    private int data;
    private int height;
    private AVLTreeNode left;
    private AVLTreeNode right;
    public int getData()
    {
        return this.data;
    }
    public int getHeight()
    {
        return this.height;
    }
    public AVLTreeNode getLeft()
    {
        return this.left;
    }
    public AVLTreeNode getRight()
    {
        return this.right;
    }
    public  void setData(int data)
    {
        this.data = data;
    }
    public  void  setHeight(int height)
    {
        this.height = height;
    }
    public void setLeft(AVLTreeNode left)
    {
        this.left = left;
    }
    public  void  setRight (AVLTreeNode right)
    {
        this.right = right;
    }
}
