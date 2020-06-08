package Tree;

public class TreeNode {
    public int data;
    public TreeNode nextSibling;
    public TreeNode firstChild;
    public int getData()
    {
        return this.data;
    }
    public void setData(int data)
    {
        this.data=  data;
    }
    public void  setNextSibling(TreeNode nextSibling)
    {
        this.nextSibling = nextSibling;
    }
    public TreeNode getNextSibling()
    {
        return this.nextSibling;
    }
    public  void setFirstChild(TreeNode firstChild)
    {
        this.firstChild = firstChild;
    }
    public TreeNode getFirstChild()
    {
        return this.firstChild;
    }

}
