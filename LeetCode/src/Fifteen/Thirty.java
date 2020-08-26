package Fifteen;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Thirty {
    private int res;

    public int countPairs(TreeNode root, int distance) {

        res = 0;
        helper(root, distance);
        return res;
    }

    private int[] helper(TreeNode node, int distance) {

        if (node == null) return new int[11];

        int[] left = helper(node.left, distance);
        int[] right = helper(node.right, distance);

        int[] A = new int[11];

        // node is leaf node, no child, just return
        if (node.left == null && node.right == null) {
            A[1] = 1;
            return A;
        }

        // find all nodes satisfying distance
        for (int i = 0; i <= 10; ++i) {
            for (int j = 0; j <= 10; ++j) {
                if (i + j <= distance) res += (left[i] * right[j]);
            }
        }

        // increment all by 1, ignore the node distance larger than 10
        for (int i = 0; i <= 9; ++i) {
            A[i + 1] += left[i];
            A[i + 1] += right[i];
        }

        return A;
    }


    private int dist = 0;

    public int countPairs1(TreeNode root, int distance) {
        dist = distance;
        helper(root);
        return res;
    }

    private int[] helper(TreeNode n) {
        int[] arr = new int[dist + 1];
        if (n == null)
            return arr;
        if (n.left == null && n.right == null) {
            arr[1] = 1;
            return arr;
        }
        int[] left = helper(n.left);
        int[] right = helper(n.right);

        for (int i = 1; i < dist; i++) {
            for (int j = 1; j < dist; j++) {
                if (i + j <= dist)
                    res += (left[i] * right[j]);
            }
        }

        for (int i = dist - 1; i > 0; i--)
            arr[i] = (left[i - 1] + right[i - 1]);
        return arr;
    }
}
