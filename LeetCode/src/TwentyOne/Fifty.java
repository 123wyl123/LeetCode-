package TwentyOne;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Fifty {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        List<Integer> b = new LinkedList<>();
        for (int i = 0; i <nums.length ; i++) {
            Integer orDefault = a.getOrDefault(nums[i], 0);
            if (orDefault>1)
            {
                continue;
            }else
            {
                Integer nums1 = a.getOrDefault(nums[i] - 1,0);
                Integer nums2 = a.getOrDefault(nums[i] + 1, 0);
                if (nums1==nums2&&nums1==0)
                {
                    b.add(nums[i]);
                }
            }
        }
        return b;
    }
}