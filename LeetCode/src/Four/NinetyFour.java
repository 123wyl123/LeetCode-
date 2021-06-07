package Four;

public class NinetyFour {
    int sum;
    int sum1;

    public int findTargetSumWays(int[] nums, int S) {
        sum = 0;
        sum1 = S;
        dps(nums, 0, 0);
        return sum;
    }

    void dps(int[] nums, int n, int temp) {
        if (n == nums.length) {
            if (temp == sum1) {
                sum++;
            }
            return;
        }
        for (int i = n; i < nums.length; i++) {
            temp -= nums[i];
            dps(nums, i + 1, temp);
            temp += nums[i];
            temp += nums[i];
        }
        if (temp == sum1) {
            sum++;
        }
    }


    public int findTargetSumWays1(int[] nums, int target) {
    int sum =0;
    int length = nums.length;
        for(int i = 0;i<length;i++)
    {
        sum+=Math.abs(nums[i]);
    }
        if(Math.abs(sum)<Math.abs(target))
    {
        return 0;
    }
    int dp[][]= new int[length][sum*2+1];
    dp[length-1][-nums[length-1]+sum]+=1;
    dp[length-1][nums[length-1]+sum]+=1;
            for(int i =length-2;i>=0;i--)
    {
        for(int j =0;j<2*sum+1;j++)
        {

            if(j>=nums[i]&&j-nums[i]<2*sum+1)
            {
                dp[i][j]+=dp[i+1][j-nums[i]];
            }
            if(j+nums[i]>=0&&j+nums[i]<2*sum+1)
            {
                dp[i][j]+=dp[i+1][j+nums[i]];
            }




        }
    }
            return dp[0][target+sum];
}



    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 1};
        new NinetyFour().findTargetSumWays(a, 3);
    }
}
