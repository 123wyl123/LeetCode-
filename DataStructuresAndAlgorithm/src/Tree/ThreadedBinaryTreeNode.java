package Tree;

public class ThreadedBinaryTreeNode {
    public ThreadedBinaryTreeNode left;
    public  int Ltag;
    public  int Rtag;
    public  int data;
    public  ThreadedBinaryTreeNode right;
    public  void  setLtag(int Ltag)
    {
        this.Ltag = Ltag;
    }
    public int getLtag()
    {
        return  this.Ltag;
    }
    public void setRtag(int Rtag)
    {
        this.Rtag =Rtag;
    }
    public int getRtag()
    {
        return this.Rtag;
    }
    public void setLeft(ThreadedBinaryTreeNode left)

    {
        this.left = left;
    }
    public ThreadedBinaryTreeNode getLeft()
    {
        return  this.left;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public  int getData()
    {
        return this.data;
    }
    public void setRight(ThreadedBinaryTreeNode right)
    {
        this.right = right;
    }
    public ThreadedBinaryTreeNode getRight()
    {
        return this.right;
    }
}
