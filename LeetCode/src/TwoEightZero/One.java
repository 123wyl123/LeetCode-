package TwoEightZero;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class One {
    public int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                {
                    return o2[1]-o1[1];
                }else
                {
                    return o1[0]-o2[0];
                }
            }
        });
       int r =logs[0][0];
       int maxr =0;
        int max =0;
        int temp=1;
        PriorityQueue<Integer> integers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return logs[o1][1] - logs[o2][1];
            }
        });
        integers.add(0);

        for (int i = 1; i <logs.length ; i++) {
            if (integers.size()==0)
            {
                integers.add(i);
                r=logs[i][0];
                continue;
            }
            if (logs[i][0]<logs[integers.peek()][1])
            {
                integers.offer(i);
                r = logs[i][0];
            }else
            {
                if (integers.size()>max)
                {
                    max = integers.size();
                    maxr = r;
                }
                i--;
                integers.poll();
            }
        }
        if (integers.size()>max)
        {
            return r;
        }else
        {
            return maxr;
        }
    }

    public static void main(String[] args) {
        int a[][]={{1993,1999},{2000,2010}};
        new One().maximumPopulation(a);
    }
}
