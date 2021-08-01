package TwoFiveTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Two {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        for (int milestone : milestones) {
            sum += milestone;
        }
Arrays.sort(milestones);

        if (milestones[milestones.length-1]>sum/2)
        {
            return (sum-milestones[milestones.length-1])*2+1;
        }else
        {
            return sum;
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,5};
        long l = new Two().numberOfWeeks(a);
        System.out.println(l);
    }
}

