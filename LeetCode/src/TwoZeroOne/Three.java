package TwoZeroOne;

import java.util.HashMap;

public class Three {
    public int maxNonOverlapping(int[] nums, int target) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - target)) {
                count++;
                sum = 0;
                map = new HashMap<>();
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
     int a[] =  {-1,3,5,1,4,2,-9};
     new Three().maxNonOverlapping(a,6);
    }
}
