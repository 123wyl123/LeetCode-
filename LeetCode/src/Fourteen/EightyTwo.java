package Fourteen;

import java.util.Arrays;

public class EightyTwo {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k)
        {
            return -1;
        }
        int ab[]=new int[bloomDay.length];
        for (int i = 0; i <bloomDay.length ; i++) {
            ab[i]=bloomDay[i];
        }
        Arrays.sort(ab);
        int l=0;
        int r=bloomDay.length;
        boolean flag = false;
        while (l<r)
        {
            int mid = (l+r)/2;
            int count =0;
            int kk=0;
            int i1 = ab[mid];
            for (int i = 0; i <bloomDay.length ; i++) {
                if (i1>=bloomDay[i])
                {
                    kk++;
                }else
                {
                    count+=kk/k;
                    kk=0;
                }
            }
            count+=kk/k;
            kk=0;
            if (count<m)
            {
                l=mid+1;
            }else
            {   flag=true;
                r=mid;
            }
        }
        if (!flag)
        {
            return -1;
        }
        return ab[r];
    }

    public static void main(String[] args) {
        int a[]= {1,10,3,10,2};
        new EightyTwo().minDays(a,3,1);
    }
}
