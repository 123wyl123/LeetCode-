package CrackingTheCodingInterview;

public class SeventeenSixteen {
    public int massage(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return nums[1];
        }
        if(nums.length==3)
        {
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        int[] a = new int[nums.length];
        int max = a[0]=nums[0];
        a[1]=nums[1];
        a[2] = nums[2]+nums[0];

        for (int i = 3; i <nums.length ; i++) {

            a[i]=Math.max(a[i-1],nums[i]+Math.max(a[i-2],a[i-3]));
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a [] ={2,1,4,5,3,1,1,3};
        new SeventeenSixteen().massage(a);
    }
}
