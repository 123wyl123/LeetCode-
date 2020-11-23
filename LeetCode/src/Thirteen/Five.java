package Thirteen;

import java.util.LinkedList;
import java.util.List;

public class Five {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> dfs = dfs(root1, new LinkedList<Integer>());
        LinkedList<Integer> dfs1 = dfs(root2, new LinkedList<Integer>());
        LinkedList<Integer> integers = new LinkedList<>();
        while (!dfs.isEmpty()&&!dfs1.isEmpty())
        {
            Integer first = dfs.getFirst();
            Integer first1 = dfs1.getFirst();
            if (first<first1)
            {   integers.addLast(first);
                dfs.removeFirst();
            }else
            {   integers.addLast(first1);
                dfs1.removeFirst();
            }
        }
        if (dfs.isEmpty())
        {
            while (!dfs1.isEmpty())
            {
                Integer integer = dfs1.removeFirst();
                integers.addLast(integer);
            }
        }else
        {
            while (!dfs.isEmpty())
            {
                Integer integer = dfs.removeFirst();
                integers.addLast(integer);
            }
        }
        return integers;
    }
    public LinkedList<Integer> dfs(TreeNode root,LinkedList<Integer> a )
    {   if (root==null)
    {
        return a;
    }
        a=  dfs(root.left,a);
        a.addLast(root.val);
        a= dfs(root.right,a);
        return a;
    }
}
