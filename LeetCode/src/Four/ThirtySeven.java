package Four;

import java.util.HashMap;

public class ThirtySeven {
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);

    }

    public HashMap<Integer,Integer> dfs(TreeNode root, int targetSum)
    {   if(root==null)
    {
        return new HashMap<Integer,Integer>() ;
    }

        HashMap<Integer,Integer> left=      dfs(root.left,targetSum);
        HashMap<Integer,Integer> right=     dfs(root.right,targetSum);
        HashMap<Integer,Integer> b=  new HashMap<Integer,Integer>();
        for(Integer temp: left.keySet())
        {
            b.put(temp,b.getOrDefault(temp,0)+left.get(temp));

        }

    }
}