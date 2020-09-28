package Three;

public class Zero {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int dp[] = new int[length];
        dp[0] = 1;
        for (int i = 1; i < length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    max = Math.max(dp[j], max);
                }
            }
            dp[i] = max + 1;
        }
        int max = 0;
        for (int i = 0; i < length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public int lengthOfLIS1(int[] nums) {
        int[] dp = new int[nums.length];
        int[] ends = new int[nums.length];
        ends[0] = nums[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for (int i = 1; i < nums.length; i++) {
            l = 0;
            r = right;
            while (l <= r) {
                m = (l + r) / 2;
                if (nums[i] > ends[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            right = Math.max(right, l);
            ends[l] = nums[i];
            dp[i] = l + 1;
        }
        int max1 = 0;
        for (int i = 0; i < ends.length; i++) {
            max1 = Math.max(max1, dp[i]);
        }
        return max1;
    }

}
