package Four;

import java.util.HashMap;

public class ThirtySeven {
    HashMap <Integer,Integer> hash ;
    public int pathSum(TreeNode root, int targetSum) {
        hash =new HashMap<>();
        dfs(root,targetSum);
        return hash.getOrDefault(targetSum,0);
    }

    public HashMap<Integer,Integer> dfs(TreeNode root,int targetSum)
    {   if(root==null)
    {
        return new HashMap<Integer,Integer>() ;
    }

        HashMap<Integer,Integer> left=      dfs(root.left,targetSum);
        HashMap<Integer,Integer> right=     dfs(root.right,targetSum);
        HashMap<Integer,Integer> b=  new HashMap<Integer,Integer>();
        for(Integer temp: left.keySet())
        {

            b.put(temp+root.val,b.getOrDefault(temp+root.val,0)+left.get(temp));
        }
        for(Integer temp : right.keySet())
        {

            b.put(temp+root.val,b.getOrDefault(temp+root.val,0)+right.get(temp));
        }
        b.put(root.val,b.getOrDefault(root.val,0)+1);
        for(Integer cur:b.keySet())
        {
            hash.put(cur,hash.getOrDefault(cur,0)+b.get(cur));
        }
        return b;
    }
}