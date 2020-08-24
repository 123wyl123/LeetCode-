package TwoZeroThree;

import java.util.HashMap;
import java.util.Map;

public class Three {
    public int findLatestStep(int[] arr, int m) {
        int n = arr.length;
        int res = -1;
        int[] length = new int[n+2];
        int[] count = new int[n+1];
        for (int i = 0; i <n ; i++) {
            int a = arr[i],left = length[a-1],right = length[a+1];
            length[a] = length[a-left]=length[a+right] = left+right+1;
            count[left]--;
            count[right]--;
            count[left+right+1]++;
            if(count[m]>0)
            {
                res = i+1;
            }
        }
return res;
    }
    public int findLatestStep1(int[] arr, int m) {
        int res = -1, n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] ls = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int pos = arr[i], ceil = map.getOrDefault(pos + 1, 0), floor = map.getOrDefault(pos - 1, 0), newLen = ceil + floor + 1;
            if (ceil > 0) ls[ceil]--;
            if (floor > 0) ls[floor]--;
            map.put(pos - floor, newLen);
            map.put(pos + ceil, newLen);
            ls[newLen]++;
            if (ls[m] > 0) res = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,4,2};
        new Three().findLatestStep(a,2);
    }
}

