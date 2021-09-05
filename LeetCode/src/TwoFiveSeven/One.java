package TwoFiveSeven;

import java.util.Arrays;

public class One {
    int sum=0;
    public int countQuadruplets(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,0,0,0);
        return sum;
    }
    public void dfs(int [] nums, int i,int cur,int shu)
    {   if (shu==3)
    {
        for (int j =i ; j <nums.length ; j++) {
            if (nums[j]==cur)
            {

                System.out.println(cur);
                sum++;
            }
        }
        return;
    }
        for (int j = i; j <nums.length ; j++) {

            dfs(nums,j+1,cur+nums[j],shu+1);
        }
    }

    public static void main(String[] args) {
       int a[]= {28,8,49,85,37,90,20,8};
        new One().countQuadruplets(a);
    }
}
