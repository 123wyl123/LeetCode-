package Two;

import java.util.LinkedList;
import java.util.List;
class TreeNode {
   int val;
    TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
 }


public class FiftySeven {
    List<String> strings;

    public List<String> binaryTreePaths(TreeNode root) {

        strings = new LinkedList<>();

        if(root==null)
        {
            return strings;
        }
        dps(root,"");
        return strings;
    }
    public void dps(TreeNode root,String a)
    {
        if(root==null)
        {
            return;
        }
        if(a.equals(""))
        {
            a=a+root.val;
        }else
        {
            a=a+"->"+root.val;
        }
        if(root.left==null&root.right==null)
        {
            strings.add(a);
            return;
        }
        dps(root.left,a);
        dps(root.right,a);
    }
}
