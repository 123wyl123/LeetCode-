package One;

public class Eight {
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root = new TreeNode(nums[nums.length/2]);
        root.left = line(0,nums.length/2,nums);
        root.right = line(nums.length/2+1,nums.length,nums);
        return root;
    }
    public TreeNode line(int a,int b,int[] nums)

    {   TreeNode root;
        if(a>b||a<0||b<0||a==b)
        {
            return null;
        }


        root = new TreeNode(nums[(a+b)/2]);



        root.left = line(a,(b+a)/2,nums);
        root.right = line((b+a)/2+1,b,nums);
        return root;
    }

    public static void main(String[] args) {
        int [] a= {-10,-3,0,5,9};
        new Eight().sortedArrayToBST(a);

    }
}
