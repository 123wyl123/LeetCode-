package Acwing.Zero;

public class Fourteen {
    public int duplicateInArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j])
                {
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public int duplicateInArray1(int[] nums){
        int l =1;
        int r = nums.length;
        while (l<r)
        {
            int mid = (l+r)>>1;
            int s =0;
            for (int num : nums) {
                if(num>l&& num <mid)
                {
                    s++;
                }
            }
            if(s>mid-l+1)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return r;
    }
}
//
//14. 不修改数组找出重复的数字
//        给定一个长度为n+1n+1的数组nums，数组中所有的数均在1∼n1∼n的范围内，
//        其中n≥1n≥1。请找出数组中任意一个重复的数，但不能修改输入的数组
