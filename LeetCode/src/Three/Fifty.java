package Three;

import java.util.ArrayList;
import java.util.Arrays;

public class Fifty {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l = Math.min(nums1.length,nums2.length);
        int j=0;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i <nums1.length ; ) {
            if(j==nums2.length)
            {
                break;
            }
            if(nums1[i]==nums2[j])
            {
                arrayList.add(nums1[i]);
                j++;
                i++;
                continue;
            }
            if(nums1[i]<nums2[j])
            {
                i++;
                continue;
            }
           else {
               j++;
                continue;
            }

        }

        int a[] = new int[arrayList.size()];
        for (int i = 0; i <a.length ; i++) {
            a[i]=arrayList.remove(0);
        }

return a;
    }

    public static void main(String[] args) {
        int a[]= {1,2,2,1};
        int b[] ={2,2};
        new Fifty().intersect(a,b);
    }
}
