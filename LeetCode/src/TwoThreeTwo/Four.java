package TwoThreeTwo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Four {
    public int maximumScore(int[] nums, int k) {
        int aaa[] = new int[nums.length];
        int bbb[] = new int[nums.length];
        Deque<Integer> a = new LinkedList<>();
        Deque<Integer> b = new LinkedList<>();
        int max =0;
        for (int i = 0; i <nums.length ; i++) {
            if (a.isEmpty())
            {
                a.push(i);
            }else
            {
                if (nums[i]>=nums[a.peek()])
                {
                    a.push(i);
                }else
                {
                    while (!a.isEmpty()&&nums[i]<nums[a.peek()])
                    {
                        Integer pop = a.pop();
                        aaa[pop]=i-1;
                    }
                    a.push(i);
                }
            }
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if (b.isEmpty())
            {
                b.push(i);
            }else
            {
                if (nums[i]>nums[b.peek()])
                {
                    b.push(i);
                }else
                {
                    while (!b.isEmpty()&&nums[i]<nums[b.peek()])
                    {
                        Integer pop = b.pop();
                        bbb[pop]=i;
                    }
                }
                b.push(i);
            }
        }

        while (a.size()>1)
        {
            Integer integer = a.removeLast();
            aaa[integer] = a.peek();
        }
        aaa[a.peek()] = a.peek();
        while (b.size()>1)
        {
            Integer integer = b.removeLast();
            bbb[integer] = b.peek()-1;
        }
        bbb[b.peek()] = b.peek()-1;
        for (int i = 0; i <nums.length ; i++) {
            if (aaa[i]>=k&&bbb[i]<k)
            {
                max =Math.max(max,nums[i]*(aaa[i]-bbb[i]));
            }
        }
        return max;
    }
    public int maximumScore1(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int n = nums.length;
        int max = nums[k];

        for(int i = 0; i < n; i++) {

            while(stack.peek() != -1 && nums[stack.peek()] >= nums[i]) {
                int currentHeight = nums[stack.pop()];
                int currentWidth = i - stack.peek() - 1;

                if(stack.peek() < k && i > k){

                    max = Math.max(max, currentHeight * currentWidth);

                }
            }
            stack.push(i);
        }
        while(stack.peek() != -1) {
            int currentHeight = nums[stack.pop()];
            int currentWidth = n - stack.peek() - 1;
            if(stack.peek() < k){

                max = Math.max(max, currentHeight * currentWidth);

            }
        }
        return max;
    }
    public static void main(String[] args) {
       int a[]= {8407,5626,9236,4362,9678,6568,4170,5691,7865,4067,2094,9451,9667,1400,5093,6191,7286,7368,6461,4309,9751,3672,4165,4940,3726,7003,6263,4250,1950,9536,61,1486,6009,6977,7084,2472,7921,1913,117,3543,5075,1582,7987,6710,1331,3023,6856,1125,1475,4158,3422,7864,9178,7255,4997,2128,5441,5910,6719,1308,4444,9746} ;
       int b[] = {3,4,3,7,4,5};
        new Four().maximumScore1(b,3);
    }
}
