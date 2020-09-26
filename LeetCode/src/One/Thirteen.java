package One;

import java.util.LinkedList;
import java.util.List;

public class Thirteen {
    List<List<Integer>> a ;
    int temp;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        temp = sum;
        a = new LinkedList<>();
        if (root==null)
        {
            return a;
        }
        dfs(root,0,new LinkedList<Integer>());
        return a;
    }
    void dfs(TreeNode root,int l,List<Integer> list)
    {
        if (root.left==null&&root.right==null)
        {
            l+=root.val;
            list.add(root.val);
            if (l==temp)
            {
                a.add(new LinkedList<>(list));
            }
            return;
        }
        l+=root.val;
        list.add(root.val);
        if (root.left!=null)
        {
            dfs(root.left,l,list);
            list.remove(list.size()-1);
        }
        if (root.right!=null)
        {
            dfs(root.right,l,list);
            list.remove(list.size());
        }
    }
}
