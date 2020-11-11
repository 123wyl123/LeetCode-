package Five;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Thirteen {
    public int findBottomLeftValue(TreeNode root) {
        if (root==null)
        {
            return 0;
        }
        Queue<TreeNode> a = new LinkedList<>();
        a.offer(root);
        int b = root.val;
        int k =1;
        HashMap<Integer, Integer> kIntegerHashMap = new HashMap<Integer, Integer>();
        kIntegerHashMap.put(1,root.val);
        while (!a.isEmpty())
        {
            int size = a.size();
            k++;
            for (int i = 0; i <size ; i++) {
                TreeNode poll = a.poll();
                if (poll.left!=null)
                {
                    a.offer(poll.left);
                    if (!kIntegerHashMap.containsKey(k))
                    {
                        kIntegerHashMap.put(k,poll.left.val);
                    }
                }
                if (poll.right!=null)
                {
                    a.offer(poll.right);
                    if (!kIntegerHashMap.containsKey(k))
                    {
                        kIntegerHashMap.put(k,poll.right.val);
                    }
                }

            }
        }
        int max =0;
        for (Integer integer : kIntegerHashMap.keySet()) {
            max = Math.max(integer,max);
        }
        return kIntegerHashMap.get(max);
    }
    public int findBottomLeftValue1(TreeNode root) {
        int[] ret = {0, -1};
        dfs(root, ret, 0);
        return ret[0];
    }

    private void dfs(TreeNode root, int[] ret, int depth) {
        if (root == null)
            return;

        dfs(root.left, ret, depth + 1);
        dfs(root.right, ret, depth + 1);
        if (depth > ret[1]) {
            ret[0] = root.val;
            ret[1] = depth;
        }
    }
}
