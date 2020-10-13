package Four;

public class EightyOne {
    public int findUnsortedSubarray(int[] nums) {
        boolean max[] = new boolean[nums.length];

        boolean min[] = new boolean[nums.length];
        int start = nums.length;
        int end = 0;
        int max1 = nums[0];
        max[0] = true;
        for (int i = 1; i < nums.length; i++) {
            if (max1 > nums[i]) {
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
            max1 = Math.max(max1,nums[i]);
        }
        int min1 = nums[nums.length-1];
        for (int i = nums.length-1; i >=0 ; i--) {
            if (min1<nums[i])
            {
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
            min1 = Math.min(min1,nums[i]);
        }
        return end-start+1<0?0:end-start+1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 3};
        new EightyOne().findUnsortedSubarray(a);
    }
}
