package TwoEightZero;

import java.util.Deque;
import java.util.LinkedList;

public class Three {
    public int maxSumMinProduct(int[] nums) {
        Deque<Integer> a  = new LinkedList<>();
        long sum[]= new long[nums.length];
        sum[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            sum[i]=sum[i-1]+nums[i];
        }
        int b[] = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if (a.size()==0)
            {
                a.push(i);
            }else if (nums[i]>=nums[a.peek()])
            {
                a.push(i);
            }else
            {
               while (!a.isEmpty()&&nums[i]<nums[a.peek()])
                {
                        Integer pop = a.pop();
                        b[pop]=i-1;
                }
                a.push(i);
            }
        }
        while (!a.isEmpty())
        {
            Integer pop = a.pop();
            b[pop]=nums.length-1;
        }
        long temp=0;

        int c[]=new int[nums.length];
        for (int i = nums.length-1; i >=0 ; i--) {
            if (a.size()==0)
            {
                a.push(i);
            }else if (nums[i]>=nums[a.peek()])
            {
                a.push(i);
            }else
            {
                while (!a.isEmpty()&&nums[i]<nums[a.peek()])
                {
                    Integer pop = a.pop();
                    c[pop]=i+1;
                }
                a.push(i);
            }
        }
        while (!a.isEmpty())
        {
            Integer pop = a.pop();
            c[pop]=0;
        }
        for (int i = 0; i <nums.length ; i++) {
            long l = (long) nums[i] * (sum[b[i]] - sum[c[i]] + nums[c[i]]);
            temp =Math.max(l,temp);
        }
        return (int) (temp%1000000007);
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,6,4,2};
        new Three().maxSumMinProduct(a);
    }
}
