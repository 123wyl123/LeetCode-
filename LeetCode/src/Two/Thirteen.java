package Two;

public class Thirteen {
    public int rob(int[] nums) {
        if (nums.length<2)
        {
            return nums[0];
        }
        if (nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        int dp[] = new int[2];
        dp[0] = nums[0];
        dp[1] = nums[0];
        int gg = 0;
        for (int i = 2; i <nums.length-1 ; i++) {

            gg= Math.max(dp[0],dp[1]);
            dp[1] = Math.max(dp[0]+nums[i],dp[1]);
            dp[0]=gg;
        }
        int max = Math.max(dp[0],dp[1]);
        int dp1[]  = new int[2];
        dp1[0]=0;
        dp1[1] = nums[1];

        for (int i = 2; i <nums.length-1 ; i++) {

            gg= Math.max(dp1[0],dp1[1]);
            dp1[1] = Math.max(dp1[0]+nums[i],dp1[1]);
            dp1[0]=gg;
        }
        int temp = 0;
        if (dp1[0]>=dp1[1])
        {
            temp = dp1[0]+nums[nums.length-1];
        }else if (dp1[0]<dp1[1])
        {
            temp=Math.max(dp1[0]+nums[nums.length-1],dp1[1]);
        }
        return Math.max(max,temp);
    }

    public static void main(String[] args) {
        int a[] = {1,2,1,1};
        new Thirteen().rob(a);
    }
}
