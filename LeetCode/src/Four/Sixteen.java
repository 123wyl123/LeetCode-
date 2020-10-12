package Four;

public class Sixteen {

    public boolean canPartition(int[] nums) {


        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }

        if (sum%2!=0)
        {
            return false;
        }else
        {
            sum=sum/2;
            boolean dp[][] = new boolean[nums.length+1][sum+1];
            for (int i = 0; i <nums.length ; i++) {
                dp[i][0] = true;
            }

            for (int i = 1; i <=nums.length ; i++) {
                for (int j = 1; j <=sum ; j++) {
                dp[i][j] = dp[i-1][j];
                if (j>=nums[i-1])
                {
                    dp[i][j] = dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                }
            }
            return dp[nums.length][sum];
        }

    }


    public static void main(String[] args) {
        int a[] = {4,4,4,4,4,4,4,4,8,8,8,8,8,8,8,8,12,12,12,12,12,12,12,12,16,16,16,16,16,16,16,16,20,20,20,20,20,20,20,20,24,24,24,24,24,24,24,24,28,28,28,28,28,28,28,28,32,32,32,32,32,32,32,32,36,36,36,36,36,36,36,36,40,40,40,40,40,40,40,40,44,44,44,44,44,44,44,44,48,48,48,48,48,48,48,48,52,52,52,52,52,52,52,52,56,56,56,56,56,56,56,56,60,60,60,60,60,60,60,60,64,64,64,64,64,64,64,64,68,68,68,68,68,68,68,68,72,72,72,72,72,72,72,72,76,76,76,76,76,76,76,76,80,80,80,80,80,80,80,80,84,84,84,84,84,84,84,84,88,88,88,88,88,88,88,88,92,92,92,92,92,92,92,92,96,96,96,96,96,96,96,96,97,99};
        new Sixteen().canPartition(a);
    }
}
