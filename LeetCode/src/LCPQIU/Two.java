package LCPQIU;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Two {
    public int maxmiumScore(int[] cards, int cnt) {
        PriorityQueue<Integer> ji= new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        PriorityQueue<Integer> ou = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int card : cards) {
            if (card%2==0)
            {
                ou.add(card);
            }else
            {
                ji.add(card);
            }
        }
        int sum=0;

        if (cnt%2==1)
        {

            if (ou.size()>0) {
                sum += ou.poll();
                cnt--;
            }else
            {
                return 0;
            }
        }
        while (cnt>0&&ou.size()>=2&&ji.size()>=2)
        {
            Integer poll = ou.poll();
            Integer poll1 = ou.poll();
            Integer poll2 = ji.poll();
            Integer poll3 = ji.poll();
            if (poll+poll1>poll2+poll3)
            {
                sum=sum+poll+poll1;
                ji.add(poll2);
                ji.add(poll3);
            }else
            {
                sum=sum+poll2+poll3;
                ou.add(poll1);
                ou.add(poll);
            }
            cnt-=2;
        }
        if (cnt>0)
        {
            if (ou.size()>=2)
            {
               while (cnt>0)
               {
                   cnt-=2;
                   Integer poll = ou.poll();
                   Integer poll1 = ou.poll();
                   sum=sum+poll+poll1;
               }
            }else if (ji.size()>=2)
            {
                while (cnt>0)
                {
                    cnt-=2;
                    Integer poll = ji.poll();
                    Integer poll1 = ji.poll();
                    sum=sum+poll+poll1;
                }
            }else
            {
                return 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11};
        new Two().maxmiumScore(a,11);
    }
}
