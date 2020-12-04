package Six;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class SixtyTwo {
    public int widthOfBinaryTree(TreeNode root) {
        if (root==null)
        {
            return 0;
        }
        System.out.println(Integer.MAX_VALUE);
        int temp = 1;
        HashMap<TreeNode, Integer> treeNodeIntegerHashMap = new HashMap<>();
        treeNodeIntegerHashMap.put(root,1);
        Deque<TreeNode> a = new LinkedList<>();
        a.add(root);
        while (!a.isEmpty())
        {
            int size = a.size();
            long  left =Integer.MAX_VALUE;
        long right =Integer.MIN_VALUE;
            for (int i = 0; i <size; i++) {
                TreeNode treeNode = a.removeFirst();
                Integer integer = treeNodeIntegerHashMap.get(treeNode);
                if (treeNode.left!=null)
                {
                    left =  left==Integer.MAX_VALUE?integer*2+1:left;
                    right = integer*2+1;
                    a.addLast(treeNode.left);
                    treeNodeIntegerHashMap.put(treeNode.left,integer*2+1);
                }
                if (treeNode.right!=null)
                {   left = left==Integer.MAX_VALUE?integer*2+2:left;
                    right = integer*2+2;
                    a.addLast(treeNode.right);
                    treeNodeIntegerHashMap.put(treeNode.right,integer*2+2);
                }

            }

            if (right<left)
            {

                return temp;
            }
        temp=Math.max((int)(right-left)+1,temp);
        }

        return temp;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
//        TreeNode treeNode1 = new TreeNode(3);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(5);
//        TreeNode treeNode4 = new TreeNode(3);
//        TreeNode treeNode5 = new TreeNode(9);
//        treeNode2.right =treeNode5;
//        treeNode.left=treeNode1;
//        treeNode.right=treeNode2;
//        treeNode1.left=treeNode3;
//        treeNode1.right=treeNode4;
        new SixtyTwo().widthOfBinaryTree(treeNode);
    }
}
