package Twenty;

public class Sixteen {
    public int maximumDifference(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int max =-1;
        int maxr[]=new int[nums.length];
        for (int i = nums.length-2; i >=0 ; i--) {
            maxr[i]=Math.max(nums[i+1],maxr[i+1]);
        }

        for (int i = 0; i <nums.length-1 ; i++) {
            max=Math.max(max,maxr[i]-nums[i]);
        }
        return max==0?-1:max;
    }
}