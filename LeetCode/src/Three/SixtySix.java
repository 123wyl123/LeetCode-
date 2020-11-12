package Three;

import java.util.LinkedList;
import java.util.List;

public class SixtySix {
    List<List<Integer>> a ;
    public List<List<Integer>> findLeaves(TreeNode root) {

        a = new LinkedList<>();
        if (root==null)
        {
return a;
        }

        while (root.left!=null||root.right!=null)
        {
            LinkedList<Integer> integers = new LinkedList<>();
            dfs(root,integers);
            a.add(integers);
        }
        if (root.left==null&&root.right==null)
        {
            LinkedList<Integer> integers = new LinkedList<>();
            integers.add(root.val);
            a.add(integers);
            return a;
        }
        return a;
    }
    public void dfs(TreeNode root,LinkedList<Integer> a)
    {   if (root==null)
    {
        return;
    }
        dfs(root.left,a);
        dfs(root.right,a);
        if (root.left==null&&root.right==null)
        {
            a.add(root.val);
            root.val=Integer.MIN_VALUE;
            return;
        }
        if (root.left!=null&&root.left.val==Integer.MIN_VALUE)
        {
            root.left=null;
        }
        if (root.right!=null&&root.right.val==Integer.MIN_VALUE)
        {
            root.right=null;
        }
    }
}
