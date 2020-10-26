package Nine;



import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class SeventyOne {
    boolean flag;
    int a ;
    LinkedList<Integer> integers;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        integers = new LinkedList<>();
        if (root==null)
        {
            return integers;
        }
        if (root.val!=voyage[0])
        {
            integers.add(-1);
            return integers;
        }
        a = 0;
        flag = true;
        dfs(root,voyage);
        if (!flag)
        {
            LinkedList<Integer> integers1 = new LinkedList<>();
            integers1.add(-1);
            return integers1;
        }else
        {
            return integers;
        }
    }
    public  void dfs(TreeNode root ,int [] voyage)
    {   if (!flag)
    {
        return;
    }
        if (root==null)
        {
            return;
        }
        if (root.left==null&&root.right==null)
        {
            return;
        }
        a++;
        if (root.left!=null)
        {
            if (root.left.val==voyage[a])
            {
                dfs(root.left,voyage);

                if (root.right!=null)
                {    a++;
                    if (root.right.val==voyage[a])
                    {
                        dfs(root.right,voyage);
                    }else
                    {
                        flag = false;
                    }

                }

            }else
            {   if (root.right!=null&&root.right.val==voyage[a])
            {   integers.add(root.val);
                dfs(root.right,voyage);

                if (root.left.val==voyage[++a])
                {
                    dfs(root.left,voyage);
                }else
                {
                    flag = false;
                    return;
                }

            }else
            {
                flag = false;
                return;
            }

            }
        }else
        {
            if (root.right.val==voyage[a])
            {
                dfs(root.right,voyage);

            }else
            {
                flag=false;
                return;
            }
        }



    }

    public static void main(String[] args) {
        TreeNode q = new TreeNode(8);
        TreeNode treeNode = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(12);
        TreeNode treeNode2 = new TreeNode(29);
        TreeNode treeNode3 = new TreeNode(50);
        TreeNode treeNode4 = new TreeNode(41);
        TreeNode treeNode5 = new TreeNode(42);
        TreeNode treeNode6 = new TreeNode(34);
        q.left = treeNode2;
       q.right = treeNode;
       treeNode.left = treeNode1;
       treeNode2.left = treeNode3;
        int a[] = {2,4,3,1,5};
        new SeventyOne().flipMatchVoyage(q,a);
    }
}
