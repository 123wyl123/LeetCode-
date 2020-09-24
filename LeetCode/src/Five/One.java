package Five;

import java.util.HashMap;
import java.util.LinkedList;

public class One {
    HashMap<Integer, Integer> treeNodeIntegerHashMap;
    public int[] findMode(TreeNode root) {
         treeNodeIntegerHashMap = new HashMap<>();
         int max = 0;
        dps(root);
        for (Integer integer : treeNodeIntegerHashMap.keySet()) {
            max = Math.max(max,treeNodeIntegerHashMap.get(integer));
        }
        LinkedList<Integer> integers = new LinkedList<>();
        for (Integer integer : treeNodeIntegerHashMap.keySet())
        {
            if (max ==treeNodeIntegerHashMap.get(integer))
            {
                integers.add(integer);
            }
        }
        int a[] = new int[integers.size()];
        for (int i = 0; i <a.length ; i++) {
            a[i]=integers.get(i);
        }
        return a;
    }
    void dps(TreeNode root)
    {   if (root==null)
    {
        return;
    }
        dps(root.left);
        treeNodeIntegerHashMap.put(root.val,treeNodeIntegerHashMap.getOrDefault(root.val,0)+1);
        dps(root.right);
    }

    public static void main(String[] args) {

    }
}
