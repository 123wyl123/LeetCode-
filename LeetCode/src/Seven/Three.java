package Seven;

import java.util.*;

public class Three {
   LinkedList<Integer> a = new LinkedList<Integer>();
   int m;
    public Three(int k, int[] nums) {
        m=k;
        for (int i = 0; i <nums.length ; i++) {
            a.addLast(nums[i]);
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        while (a.size()>k)
        {
            a.removeFirst();
        }
    }

    public int add(int val) {
        Deque <Integer> b = new LinkedList<Integer>();
        if (a.size()<m)
        {
            while (!a.isEmpty()&&a.getFirst()<val)
            {
                Integer integer = a.removeFirst();
                b.addLast(integer);
            }
            a.addFirst(val);
            while (!b.isEmpty())
            {
                Integer integer = b.removeLast();
                a.addFirst(integer);
            }
            return a.getFirst();
        }
        if (val<=a.getFirst())
        {
            return a.getFirst();
        }else
        {
            a.removeFirst();
            while (!a.isEmpty()&&a.getFirst()<val)
            {
                Integer integer = a.removeFirst();
                b.addLast(integer);
            }
            a.addFirst(val);
            while (!b.isEmpty())
            {
                Integer integer = b.removeLast();
                a.addFirst(integer);
            }
            return a.getFirst();
        }
    }

    public static void main(String[] args) {
            int a[] ={0};
        Three three = new Three(2, a);
        three.add(-1);
        three.add(1);
        three.add(-2);
        three.add(-4);
        three.add(3);
    }
}
