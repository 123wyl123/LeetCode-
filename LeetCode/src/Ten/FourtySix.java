package Ten;

import java.util.PriorityQueue;

public class FourtySix {
    public int lastStoneWeight(int[] stones) {

        int length = stones.length;
        if (length==0)
        {
            return 0;
        }


        PriorityQueue<Integer> integers = new PriorityQueue<>((Integer a, Integer b) ->
        {
            return b - a;
        });
        for (int i = 0; i <length ; i++) {
           integers.add(stones[i]);
        }
    while (integers.size()>1)
    {
        Integer poll = integers.poll();
        Integer poll1 = integers.poll();
        if (poll>poll1)
        {
            poll=poll-poll1;
            integers.add(poll);
        }else  if (poll1>poll)
        {
            poll1=poll1-poll;
            integers.add(poll1);
        }else
        {
            poll=0;
            poll1=0;
        }
    }
    return integers.size()==0?0:integers.poll();
    }

    public static void main(String[] args) {
        int a[] ={2,7,4,1,8,1};
        int i = new FourtySix().lastStoneWeight(a);
        System.out.println(i);
    }
}
