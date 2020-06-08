package Tree;

public class PrinthPath {
    public PrinthPath(BinaryTreeNode root  )
    {   BinaryTreeNode node = root;
        int[] path = new int[256];
        PrinthPaths(node,path,0);
    }
    private void PrinthPaths(BinaryTreeNode node,int[]path,int pathlen)
    {
        if(node == null)
            return;
        path[pathlen] = node.getData();
        pathlen++;
        if(node.getLeft()==null&&node.getRight()==null)
        {
            PrintArray(path,pathlen);
        }
        else
        {
            PrinthPaths(node.getLeft(),path,pathlen);
            PrinthPaths(node.getRight(),path,pathlen);
        }
    }
    private void PrintArray(int[]path,int len)
    {
        for (int i =0;i<len;i++)
        {
            System.out.print(path[i]+" ");
        }
        System.out.println();
    }
}
