package Zero;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NinetyFour {
    List<Integer> a;
    public List<Integer> inorderTraversal(TreeNode root) {
        a=new LinkedList<>();
        Inorder(root);

        return a;

    }
    public void Inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        a.add(root.val);
        Inorder(root.right);
        return;
    }
    public List<Integer> inorderTraversal1(TreeNode root) {
        a=new LinkedList<>();
        if(root==null)
        {
            return a;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){

            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                cur = stack.pop();
                a.add(cur.val);
                cur = cur.right;
            }
        }
        return a;
    }
}
