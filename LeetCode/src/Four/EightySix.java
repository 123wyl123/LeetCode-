package Four;

public class EightySix {

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) { dp[i][i] = nums[i]; }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }

    public boolean PredictTheWinner1(int[] nums) {


        return f(nums,0,nums.length-1)>=s(nums,0,nums.length-1);
    }
    public int f(int []nums,int l ,int r)
    {
     if (l==r)
     {
         return nums[r];
     }
     return Math.max(nums[l]+s(nums,l+1,r),nums[r]+s(nums,l,r-1));
    }
    public int s(int []nums,int l ,int r)
    {
        if (l==r)
        {
            return 0;
        }
        return Math.min(f(nums,l+1,r),f(nums,l,r-1));
    }

    public static void main(String[] args) {
        int a[ ]={1,5,233,7};
        new EightySix().PredictTheWinner1(a);
    }
}
