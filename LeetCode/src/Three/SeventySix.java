package Three;

import java.util.Deque;
import java.util.LinkedList;

public class SeventySix {
    public int wiggleMaxLength(int[] nums) {
        int length = nums.length;
        if (length<2)
        {
            return length;
        }
        int max=0;
        Deque <Integer> a = new LinkedList<>();
        a.addLast(nums[0]);

        boolean flag= true;

        for (int i = 1; i <length ; i++) {
            if (nums[i]==nums[i-1])
            {
                continue;
            }else if (nums[i]>a.getLast())
            {
               if (a.size()!=1&&flag)
               {
                   a.addLast(nums[i]);
                   flag=!flag;
               }else if (a.size()!=1&&!flag)
               {
                   a.removeLast();
                   a.addLast(nums[i]);
               }else if (a.size()==1)
               {
                   a.addLast(nums[i]);
                   flag=false;
               }
            }else
            {
                if (a.size()!=1&&!flag)
                {
                    a.addLast(nums[i]);
                    flag=!flag;
                }else if (a.size()!=1&&flag)
                {
                    a.removeLast();
                    a.addLast(nums[i]);
                }else if (a.size()==1)
                {
                    a.addLast(nums[i]);
                    flag=true;
                }
            }
        }

        return a.size();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int i = new SeventySix().wiggleMaxLength(a);
        System.out.println(i);

    }
}
