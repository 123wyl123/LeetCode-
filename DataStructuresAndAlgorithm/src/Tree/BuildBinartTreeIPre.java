package Tree;

public class BuildBinartTreeIPre {
   BinaryTreeNode root;
    static int preIndex = 0;

    /* Recursive function to construct binary of size len from
       Inorder traversal in[] and Preorder traversal pre[].
       Initial values of inStrt and inEnd should be 0 and len -1.
       The function doesn't do any error checking for cases where
       inorder and preorder do not form a tree */
    BinaryTreeNode buildTree(char in[], char pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;

        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
        BinaryTreeNode tNode = new BinaryTreeNode();
        tNode.setData(pre[preIndex++]);

        /* If this node has no children then return */
        if (inStrt == inEnd)
            return tNode;

        /* Else find the index of this node in Inorder traversal */
        int inIndex = search(in, inStrt, inEnd, (char) tNode.getData());

        /* Using index in Inorder traversal, construct left and
           right subtress */
        tNode.setLeft(buildTree(in, pre, inStrt, inIndex - 1));
       tNode.setRight(buildTree(in, pre, inIndex + 1, inEnd));

        return tNode;
    }

    /* UTILITY FUNCTIONS */

    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
    int search(char arr[], int strt, int end, char value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    /* This funtcion is here just to test buildTree() */
    void printInorder(BinaryTreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.getLeft());

        /* then print the data of node */
        System.out.print((char) node.getData() + " ");

        /* now recur on right child */
        printInorder(node.getRight());
    }
    public static void main(String args[])
    {

        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        BuildBinartTreeIPre a = new BuildBinartTreeIPre();

       BinaryTreeNode root = a.buildTree(in, pre, 0, len - 1);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        a.printInorder(root);
    }

}
