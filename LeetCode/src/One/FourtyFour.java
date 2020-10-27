package One;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FourtyFour {
    public List<Integer> preorderTraversal(TreeNode root) {

        LinkedList<Integer> integers = new LinkedList<>();
        if(root==null)
        {
            return integers;
        }
        TreeNode  head = root;
        Deque<TreeNode> a = new LinkedList<>();
        a.push(head);
        while (!a.isEmpty())
        {
            TreeNode pop = a.pop();
            integers.add(pop.val);
            if (pop.right!=null)
            {
                a.push(pop.right);
            }
            if (pop.left!=null)
            {
                a.push(pop.left);
            }

        }
        return integers;
    }
}
