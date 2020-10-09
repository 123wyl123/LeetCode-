package Sixteen;

import java.util.Arrays;

public class Eight {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int l = 0;
        int r = nums[nums.length-1];
        while (l<r)
        {
            int mid = (l+r)/2;
           int temp = dd(nums,mid);
            if (temp==0)
            {
                return mid;
            }else if (temp==-1)
            {
                r = mid-1;
            }else
            {
                l = mid + 1;
            }
        }
        return -1;
    }
    public int dd(int [] nums,int temp)
    {   int a = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]>=temp)
            {
                a++;
            }
            if (a>temp)
            {
                return 1;
            }
        }
        return a==temp?0:-1;
    }

    public static void main(String[] args) {
        int a[] = {3,9,7,8,3,8,6,6};
        new Eight().specialArray(a);
    }
}
