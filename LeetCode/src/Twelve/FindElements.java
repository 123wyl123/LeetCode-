package Twelve;

import java.util.HashSet;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class FindElements {
    HashSet<Integer> a;
    public FindElements(TreeNode root) {
        root.val=0;
        a= new HashSet<>();
        a.add(root.val);
        dfs(root.left,root,true);
        dfs(root.right,root,false);

    }

    public boolean find(int target) {
        if (a.contains(target))
        {
            return true;
        }else
        {
            return false;
        }

    }
    public  void dfs(TreeNode root,TreeNode farther,Boolean flag)
    {
        if (root==null)
        {
            return;
        }
        if (flag)
        {
            root.val = 2*farther.val+1;
        }else
        {
            root.val = 2*farther.val+2;
        }
        a.add(root.val);
        dfs(root.left,root,true);
        dfs(root.right,root,false);

    }
}
