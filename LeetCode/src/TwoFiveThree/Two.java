package TwoFiveThree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Two {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        long sum=0;
        for (int i = 0; i <piles.length ; i++) {
            integers.add(piles[i]);
            sum=sum+(long) piles[i];
        }

        for (int i = 0; i <k ; i++) {
            Integer poll = integers.poll();
          sum=  sum-poll/2;
          poll=poll-  poll/2;
          integers.add(poll);
        }
        return (int) sum;
    }
}
