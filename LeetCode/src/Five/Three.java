package Five;

import java.util.Deque;
import java.util.LinkedList;

public class Three {
    public int[] nextGreaterElements(int[] nums) {
        int aa[] = new int[nums.length];
        int k=0;
        boolean flag = true;
        int max =0;
        boolean ad[] = new boolean[nums.length];
        Deque<Integer> a  = new LinkedList<>();
        for (int i = 0; i<nums.length ; i++) {


            if (a.isEmpty())
            {
                a.push(i);
            }else if (nums[a.peek()]>=nums[i]&&!ad[i])
            {
                a.push(i);
            }else if (a.peek()==i)
            {
                break;
            }else
            {
                while (!a.isEmpty()&&nums[a.peek()]<nums[i])
                {
                    Integer pop = a.pop();
                    aa[pop] = nums[i];
                    ad[pop] = true;
                }
                if (ad[i])
                {

                }else
                {
                    a.push(i);
                }

            }
            if (i==nums.length-1&&flag)
            {
                i=-1;
                flag = false;
            }

        }
        while (!a.isEmpty())
        {
            Integer pop = a.pop();

            aa[pop] = -1;
        }
        return aa;
    }

    public static void main(String[] args) {
        int a[] ={0,-2,-3};
        new Three().nextGreaterElements(a);
    }
}
