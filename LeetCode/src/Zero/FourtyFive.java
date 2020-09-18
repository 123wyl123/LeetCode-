package Zero;

public class FourtyFive {
    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int dp[] = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            int i1 = nums[i];
            for (int j = i + 1; j <= i + i1; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                } else {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
                if (j == nums.length - 1) {
                    return dp[nums.length - 1];
                }
            }

        }
        return dp[nums.length - 1];
    }
    public static int jump1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cur < i) {
                jump++;
                cur = next;
            }
            next = Math.max(next, i + nums[i]);
        }
        return jump;
    }
}
