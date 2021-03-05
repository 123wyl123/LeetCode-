package Three;

import java.util.Arrays;
import java.util.Comparator;

public class FiftyFour {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length==0)
        {
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]<o2[0])
                {
                    return -1;
                }else if (o1[0]==o2[0])
                {
                    return o2[1]-o1[1];
                }else
                {
                    return 1;
                }
            }
        });
        int a[] =  new int[envelopes.length];
        for (int i = 0; i <envelopes.length ; i++) {
            a[i]=envelopes[i][1];
        }
        return lengthOfLIS1(a);
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
