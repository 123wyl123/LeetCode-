package Fourteen;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyEight {
    public int longestSubarray(int[] nums, int limit) {
        int l =0;
        int r=1;
        int maxx =0;
        Deque<Integer> min = new LinkedList<Integer>();
        Deque<Integer> max = new LinkedList<Integer>();
        min.addLast(l);
        max.addLast(l);
        maxx = 1;

        while (l<=r&&r<nums.length)
        {
            while (!min.isEmpty()&&nums[r]<nums[min.getLast()])
            {
                min.removeLast();
            }
            while (!max.isEmpty()&&nums[r]>nums[max.getLast()])
            {
                max.removeLast();
            }
            min.addLast(r);
            max.addLast(r);
            while (nums[max.getFirst()]-nums[min.getFirst()]>limit)
            {
                maxx = Math.max(maxx,r-l);
                if (max.getFirst()<min.getFirst())
                {   l = max.getFirst()+1;
                    max.removeFirst();

                }else
                {   l = min.getFirst()+1;
                    min.removeFirst();
                }
            }
            r++;
        }
        maxx = Math.max(maxx,r-l);
        System.out.println(maxx);
        return maxx;

    }

    public static void main(String[] args) {
        int a[] = {7,40,10,10,40,39,96,21,54,73,33,17,2,72,5,76,28,73,59,22,100,91,80,66,5,49,26,45,13,27,74,87,56,76,25,64,14,86,50,38,65,64,3,42,79,52,37,3,21,26,42,73,18,44,55,28,35,87};
        new ThirtyEight().longestSubarray(a,63);
    }
}
