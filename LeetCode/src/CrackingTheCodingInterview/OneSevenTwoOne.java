package CrackingTheCodingInterview;

import java.util.Deque;
import java.util.LinkedList;

public class OneSevenTwoOne {
    public int trap(int[] height) {
        Deque<Integer> a = new LinkedList<>();
        int sum =0;
        int pre =0;
        for (int i = 0; i <height.length ; i++) {
            if (a.isEmpty())
            {   pre = i;
                a.push(i);
            }else if (height[i]<height[a.peek()])
            {
                a.push(i);
            }else
            {
                if (height[i]>=height[pre])
                {
                    int i1 = height[pre];

                    while (!a.isEmpty())
                    {
                        sum+=i1-height[a.pop()];
                    }
                    a.push(i);
                    pre = i;
                }else
                {
                    a.push(i);
                }

            }



        }
        if (!a.isEmpty())
        {
            Integer pop = a.pop();
            int max = height[pop];
            while (!a.isEmpty())
            {
                Integer pop1 = a.pop();
                sum+=Math.max(0,max-height[pop1]);
                max =Math.max(max,height[pop1]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = new OneSevenTwoOne().trap(a);
        System.out.println(trap);
    }
}