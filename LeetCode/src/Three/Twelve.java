package Three;

public class Twelve {
    public int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length+2];
        int[][] dp = new int[newNums.length][newNums.length];
        newNums[0]=1;newNums[nums.length+1]=1;
        for(int i=0;i<nums.length;i++){
            newNums[i+1] = nums[i];
        }
        return maxCoins(newNums,0,newNums.length-1,dp);
    }
    public int maxCoins(int[] nums,int start,int end,int[][] dp){
        if(end - start == 1)return 0;
        if(dp[start][end] != 0)return dp[start][end];
        int max=0;
        for(int i=start+1;i<end;i++){
            max = Math.max(nums[i]*nums[start]*nums[end]+maxCoins(nums, start, i, dp)+maxCoins(nums, i, end, dp),max);
        }
        dp[start][end] = max;
        return max;
    }




}

