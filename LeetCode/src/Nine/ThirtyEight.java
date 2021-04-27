package Nine;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyEight {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> a = new LinkedList<>();
        if (a==null)
        {
            return 0;
        }
        int sum =0;
        while (root.left!=null)
        {
            a.push(root.left);
            root=root.left;
        }
        TreeNode pre =null;
        while (!a.isEmpty())
        {
            TreeNode pop = a.pop();
            if (pop.right!=null)
            {
                TreeNode right = pop.right;
                while (right!=null)
                {
                    a.push(right);
                    right=right.left;
                }
            }
            if (pop.val<=high&&pop.val>=low)
            {
                sum+=pop.val;
            }

        }
return sum;
    }
}
