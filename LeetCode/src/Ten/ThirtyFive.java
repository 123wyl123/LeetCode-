package Ten;

public class ThirtyFive {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int b[]= new int[nums2.length];
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        int max =0;
        for (int i = 1; i <=nums1.length ; i++) {
            for (int j = 1; j <=nums2.length ; j++) {
                if (nums1[i-1]==nums2[j-1])
                {

                    dp[i][j]=dp[i-1][j-1]+1;

                }else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                max =Math.max(max,dp[i][j]);
            }

        }
        return max;
    }


}
