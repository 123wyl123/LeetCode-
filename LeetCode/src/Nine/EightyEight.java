package Nine;

public class EightyEight {
    StringBuffer b;

    public String smallestFromLeaf(TreeNode root) {

            b= new StringBuffer();
            sa(root,new StringBuffer());
            return b.reverse().toString();
    }
    public void    sa(TreeNode root ,StringBuffer a )
    {
        if (root==null)
        {
            return;
        }
        if (root.left==null&&root.right==null)
        {   a.append((char) (root.val+'a'));
            if (b.length()==0)
            {
                b=a;
                return;
            }else
            {
                int length = a.length()-1;
                int length1 = b.length()-1;
                while (length>=0&&length1>=0)
                {
                    if (a.charAt(length)<b.charAt(length1))
                    {
                        b=a;
                        return;
                    }else if (a.charAt(length)>b.charAt(length1))
                    {
                        return;
                    }else
                    {
                        length--;
                        length1--;
                    }
                }
                if (length<0)
                {
                    b=a;
                    return;
                }
                return;
            }
        }

        char a1 =(char) ( 'a'+root.val);
        a.append(a1);
        sa(root.left,new StringBuffer(a));
        sa(root.right,new StringBuffer(a));

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode.left=treeNode1;
        treeNode.right=treeNode2;
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(0);
        treeNode1.left=null;
        treeNode1.right=treeNode3;
        TreeNode treeNode5 = new TreeNode(0);

        treeNode2.left=treeNode4;
       treeNode3.left=treeNode5;

        new EightyEight().smallestFromLeaf(treeNode);
    }
}
