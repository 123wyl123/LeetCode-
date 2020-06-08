package Tree;
class TreeNode2 {

    int val;

    TreeNode2 left;
      TreeNode2 right;

      TreeNode2(int x) { val = x; }

  }
public class BuildBST {
    public TreeNode2 sorterArratToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return convertTree(nums, 0, nums.length - 1);
    }

    public TreeNode2 convertTree(int[] nums, int l, int r) {
        if (l <= r) {
            int mid = (l + r) / 2;
            TreeNode2 newNode = new TreeNode2(nums[mid]);
            newNode.left = convertTree(nums,l,mid-1);
            newNode.right = convertTree(nums,mid+1,r);
            return newNode;
        }
        else
        {
            return null;
        }

    }
}
