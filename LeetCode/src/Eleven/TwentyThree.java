package Eleven;

import java.util.HashMap;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class TwentyThree {
    int max =0;
    TreeNode a ;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        a = null;
        if (root==null)
        {
            return root;
        }
        HashMap<Integer, TreeNode> dfs = dfs(root, 0);
        return dfs.get(max);
    }
    public HashMap<Integer,TreeNode> dfs(TreeNode root, int height)
    {
        if (root==null)
        {
            return null;
        }
        max = Math.max(height,max);
        HashMap<Integer, TreeNode> integerTreeNodeHashMapLeft= dfs(root.left,height+1);
        HashMap<Integer, TreeNode> integerTreeNodeHashMapRight = dfs(root.right,height+1);
        if (integerTreeNodeHashMapLeft==null&&integerTreeNodeHashMapRight==null)
        {
            HashMap<Integer, TreeNode> integerTreeNodeHashMap = new HashMap<>();
            integerTreeNodeHashMap.put(height,root);
            return integerTreeNodeHashMap;
        }else if (integerTreeNodeHashMapLeft==null)
        {
            return integerTreeNodeHashMapRight;
        }else if (integerTreeNodeHashMapRight==null)
        {
            return integerTreeNodeHashMapLeft;
        }else
        {
            for (Integer integer : integerTreeNodeHashMapLeft.keySet()) {
                for (Integer integer1 : integerTreeNodeHashMapRight.keySet()) {
                    if (integer==integer1)
                    {
                        HashMap<Integer, TreeNode> integerTreeNodeHashMap = new HashMap<>();
                        integerTreeNodeHashMap.put(integer,root);
                        return integerTreeNodeHashMap;
                    }else if (integer>integer1)
                    {
                        return integerTreeNodeHashMapLeft;
                    }else
                    {
                        return integerTreeNodeHashMapRight;
                    }
                }
            }

        }
        return null;

    }



}
