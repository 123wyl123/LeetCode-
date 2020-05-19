package One;

public class LeTwentySeven {
    public static int removeElement(int[] nums, int val) {
        int k =0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==val)
                {
                    k++;
                }
                else {
                    nums[i - k] = nums[i];
                }
            }
            return  nums.length-k;

    }
    public static void main(String[] args) {
        int a[] = new int[ ] {3,2,2,3};
        System.out.println(LeTwentySeven.removeElement(a,3));

    }
}
