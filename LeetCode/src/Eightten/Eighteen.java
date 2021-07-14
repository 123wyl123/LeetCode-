package Eightten;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Eighteen {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        TreeSet<Integer> q = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i <nums1.length ; i++) {
            q.add(nums1[i]);
        }
        long sum=0;
        for (int i = 0; i <nums1.length ; i++) {
            sum=(sum+Math.abs(nums1[i]-nums2[i]))%1000000007;
        }
        long max =0;
        for (int i = 0; i <nums1.length ; i++) {
            long a =Math.abs(nums1[i]-nums2[i]);
            long temp=1000000007;
            long temp1=1000000007;
            Integer ceiling = q.ceiling(nums2[i]);
            if (ceiling!=null)
            {
                temp=Math.abs(ceiling-nums2[i]);
            }
            Integer floor = q.floor(nums2[i]);
            if (floor!=null)
            {
                temp1=Math.abs(floor-nums2[i]);
            }
            max =Math.max(max,a-Math.min(temp,temp1));
        }
        return (int)(sum+1000000007-max%1000000007)%1000000007;
    }
}
