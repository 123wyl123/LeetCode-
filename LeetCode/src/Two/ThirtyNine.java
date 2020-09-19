package Two;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyNine {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length<k)
        {
            return null;
        }
        int m = nums.length;
        int [] aaa = new int[nums.length-k+1];
        Deque<Integer> aa = new LinkedList<>();
        for (int i = 0; i <k ; i++) {
            if (aa.isEmpty())
            {
                aa.addLast(i);
            }else
            {
                while (!aa.isEmpty()&&nums[aa.getLast()]<nums[i])
                {
                    aa.removeLast();
                }
                aa.addLast(i);
            }
            aaa[0]=nums[aa.peek()];
        }
        for (int i = k; i <nums.length ; i++) {

            while (!aa.isEmpty()&&i-aa.getFirst()>=k)
            {
                aa.removeFirst();
            }
            while (!aa.isEmpty()&&nums[aa.getLast()]<nums[i])
            {
                aa.removeLast();
            }
            aa.addLast(i);
            aaa[i-k+1]= nums[aa.peek()];
        }
        return aaa;
    }

    public static void main(String[] args) {
       int[]a = {4,-2};

      new ThirtyNine().maxSlidingWindow(a,2);
    }
}
