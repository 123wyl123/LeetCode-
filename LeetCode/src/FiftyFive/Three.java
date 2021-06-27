package FiftyFive;

import java.util.Deque;
import java.util.LinkedList;

public class Three {
    public long maxAlternatingSum(int[] nums) {
        if (nums.length==1)
        {
            return  nums[0];
        }
        Deque<Integer> integers = new LinkedList<>();
        integers.addLast(nums[0]);
        boolean flag =true;
        for (int i = 1; i <nums.length ; i++) {
            if (flag)
            {
                if (nums[i]<integers.peek())
                {
                    integers.push(nums[i]);
                    flag = false;
                }else
                {
                  integers.pop();
                    integers.push(nums[i]);
                }
            }else
            {
                if (nums[i]>integers.peek())
                {
                    integers.push(nums[i]);
                    flag = true;
                }else
                {
                    integers.pop();
                    integers.push(nums[i]);
                }
            }
        }
        if (integers.size()%2==0)
        {
            integers.pop();
        }
        long temp =0;
        boolean flagg =true;
       while (integers.size()!=0)
       {
           Integer pop = integers.pop();
           if (flagg)
           {
               temp+=pop;
           }else
           {
               temp-=pop;
           }
           flagg= !flagg;
       }
       return temp;
    }

    public static void main(String[] args) {
        int a[]={4,2,5,3};
        new Three().maxAlternatingSum(a);
    }
}
