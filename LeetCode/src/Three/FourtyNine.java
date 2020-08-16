package Three;

import java.util.ArrayList;
import java.util.TreeSet;

public class FourtyNine {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            integers.add(nums1[i]);
        }
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i <nums2.length ; i++) {
            if(integers.contains(nums2[i]))
            {
                integers1.add(nums2[i]);
                integers.remove(nums2[i]);
        }
    }
            int[] res = new int[integers1.size()];
        for (int i = 0; i <res.length ; i++) {
            res[i] = integers1.get(i);
        }
        return res;
    }
}
