package TwoZeroFive;

import java.util.HashMap;

public class Two {
    public int numTriplets(int[] nums1, int[] nums2) {
        int m =0;
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        HashMap<Integer, Integer> integerIntegerHashMap1 = new HashMap<>();
        for (int i = 0; i <nums1.length ; i++) {
            integerIntegerHashMap.put(nums1[i],integerIntegerHashMap.getOrDefault(nums1[i],0)+1) ;
        }
        for (int i = 0; i <nums2.length ; i++) {
            integerIntegerHashMap1.put(nums2[i],integerIntegerHashMap1.getOrDefault(nums2[i],0)+1) ;
        }
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = i+1; j <nums1.length ; j++) {
                long sum = (long)((long)nums1[i]*(long)nums1[j]);

                if(Math.sqrt(sum)-(int)Math.sqrt(sum)==0)
                {
                    m+=integerIntegerHashMap1.getOrDefault((int)Math.sqrt(sum),0);
                }


            }
        }
        for (int i = 0; i <nums2.length ; i++) {
            for (int j = i+1; j <nums2.length ; j++) {
                long sum = (long)((long)nums2[i]*(long)nums2[j]);

                if(Math.sqrt(sum)-(int)Math.sqrt(sum)==0)
                {
                    m+=integerIntegerHashMap.getOrDefault((int)Math.sqrt(sum),0);
                }


            }
        }
        return m;
    }


}

