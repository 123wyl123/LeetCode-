package Nine;

import java.util.HashMap;

public class NinetyThree {
    HashMap<Integer, String> integerStringHashMap = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(new TreeNode(-1),root,0,x,y);
       if (integerStringHashMap.containsKey(x)&&integerStringHashMap.containsKey(y))
       {
           String s = integerStringHashMap.get(x);
           String[] s1 = s.split(" ");
           String s2 = integerStringHashMap.get(y);
           String[] s3 = s2.split(" ");
           if (Integer.valueOf(s1[0])==Integer.valueOf(s3[0])&&Integer.valueOf(s1[1])!=Integer.valueOf(s3[1]))
           {
               return true;
           }
       }
       return false;

    }
    public void dfs(TreeNode farther,TreeNode root,int k,int x,int y)
    {
        if (root==null)
        {
            return;
        }
        if (root.val==x)
        {
            integerStringHashMap.put(x,k+" "+farther.val);
        }
        if (root.val==y)
        {
            integerStringHashMap.put(y,k+" "+farther.val);
        }
        dfs(root,root.left,k+1,x,y);
        dfs(root,root.right,k+1,x,y);
    }
}
