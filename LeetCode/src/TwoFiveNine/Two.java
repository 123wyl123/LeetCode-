package TwoFiveNine;

import java.util.Deque;
import java.util.LinkedList;

public class Two {
    public int sumOfBeauties(int[] nums) {
        Deque <Integer> a = new LinkedList<>();
        a.push(0);;
        int zuomax[]=new int[nums.length];
        int youmin[]=new int[nums.length];
        int b[]=new int[nums.length];
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]>nums[a.peek()])
            {
                a.push(i);
            }else
            {
                while (a.size()!=0&&nums[i]<=nums[a.peek()])
                {
                    Integer pop = a.pop();
                    youmin[pop]=nums[i];
                }
                a.push(i);
            }
        }
        while (a.size()!=0)
        {
            Integer pop = a.pop();
            if (pop!=0&&pop!=nums.length-1)
            {
                youmin[pop]=nums[nums.length-1];
            }
        }

        a.push(nums[nums.length-1]);
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]<nums[a.peek()])
            {
                a.push(i);
            }else
            {
                while (a.size()!=0&&nums[i]>=nums[a.peek()])
                {
                    Integer pop = a.pop();
                    zuomax[pop]=nums[i];
                }
                a.push(i);
            }
        }
        while (a.size()!=0)
        {
            Integer pop = a.pop();
            if (pop!=0&&pop!=nums.length-1)
            {
                zuomax[pop]=nums[0];
            }
        }

        for (int i = 1; i <=nums.length-2 ; i++) {
            if (nums[i]>nums[i-1]&&nums[i+1]>nums[i])
            {
                b[i]=Math.max(1,b[i]);
            }
            if (nums[i]>zuomax[i]&&nums[i]<youmin[i])
            {
                b[i]=2;
            }
        }
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            if (b[i]==2)
            {
                System.out.println(i);
            }
            sum+=b[i];
        }
return sum;
    }

    public static void main(String[] args) {
        int ap[]={2,2,6};
        new Two().sumOfBeauties(ap);
    }
}