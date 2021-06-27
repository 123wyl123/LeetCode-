package FiftyFive;

public class One {
    public boolean canBeIncreasing(int[] nums) {
        if (nums.length==1)
        {
            return true;
        }
        boolean flag = true;
        int pre = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]>pre)
            {
                pre = nums[i];
            }else if (flag)
            {
                flag=false;
                if (i>=2&&nums[i]>nums[i-2])
                {
                    pre = nums[i];
                }else if (i<2)
                {
                    pre = nums[i];
                }else
                {
                    pre = nums[i-1];
                }
            }else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[]={105,924,32,968};
        System.out.println(new One().canBeIncreasing(a));
    }
}
