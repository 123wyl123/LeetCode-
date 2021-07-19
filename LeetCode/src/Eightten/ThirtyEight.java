package Eightten;

import java.util.Arrays;

public class ThirtyEight {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long a[]=new long[nums.length];
        a[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            a[i]=a[i-1]+nums[i];
        }

        int max = 1;
        for (int i = 0; i <nums.length ; i++) {
            int l=0;
            int r= i;

            while (l<r)
            {
                int mid = (l+r)/2;
                if (a[i]-a[mid]+(long)nums[mid]+(long)k<(long)(i-mid+1)*(long)nums[i])
                {
                    l=mid+1;
                }else
                {
                    r=mid;
                }
            }
            max = Math.max(i-l+1,max);
        }
        return max;
    }
}