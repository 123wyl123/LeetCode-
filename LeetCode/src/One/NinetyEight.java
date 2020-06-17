package One;


public class NinetyEight {
    public int rob(int[] nums) {

        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int dp[] = new int[nums.length];

        dp[0]=nums[0];
        dp[1] = nums[1];
        int max;
        if(nums.length!=2)
        {   dp[2] = nums[2]+nums[0];
            max = Math.max(dp[1],nums[0]+nums[2]);
        }
        else
        {
            max = Math.max(dp[0],dp[1]);
        }

        for(int i=3;i<nums.length;i++)
        {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-3]+nums[i]);
            if(dp[i]>max)
            {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        NinetyEight a = new NinetyEight();
        int b[]= {2,7,9,3,1};
    int  m=  a.rob(b);
    }
}
