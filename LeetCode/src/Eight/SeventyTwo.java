package Eight;

import java.util.LinkedList;

public class SeventyTwo {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       LinkedList <TreeNode>a = new LinkedList();
       LinkedList<TreeNode> b = new LinkedList<>();
       dfs(root1,a);
       dfs(root2,b);
       if (a.size()!=b.size())
       {
           return false;
       }
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i).val!=b.get(i).val)
            {
                return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root, LinkedList<TreeNode> a)
    {
        if (root==null)
        {
            return ;
        }
        if (root.left==null&&root.right==null)
        {
            a.addLast(root);
        }
        dfs(root.left,a);
        dfs(root.right,a);

    }
}
