package Fifteen;

import java.util.HashMap;
import java.util.Map;

public class Ninety {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length, res = n, need = 0, cur = 0;
        for (int a : nums)
            need = (need + a) % p;
        Map<Integer, Integer> last = new HashMap<>();
        last.put(0, -1);
         for (int i = 0; i < n; ++i) {
            cur = (cur + nums[i]) % p;
            last.put(cur, i);
            int want = (cur - need + p) % p;
            res = Math.min(res, i - last.getOrDefault(want, -n));
        }
        return res < n ? res : -1;
    }

    public static void main(String[] args) {
        int a[] ={26,19,11,14,18,4,7,1,30,23,19,8,10,6,26,3};
        new Ninety().minSubarray(a,26);

    }
}
