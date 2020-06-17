package  Seven;
import java.util.HashMap;
import java.util.LinkedList;

public class LeThirtyNine {
    public int[] dailyTemperatures(int[] T) {
        if (T == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> a = new LinkedList<>();


//        for(int i =0;i<T.length;i++)
//        {
//          a.push(T[i]);
//        }
        int min = 0;
        int max = 0;
        for (int i = T.length - 1; i >= 0; i--) {
            if (max == 0) {
                max = T[i];
            }
            if (T[i] > max) {
                max = T[i];
            }
            map.put(T[i], i);
            int temp = T[i];
            ++temp;
            while (T[i] < temp && temp <= max) {
                if (!map.containsKey(temp)) {
                    ++temp;
                    continue;
                } else {
                    int mm = map.get(temp) - i;
                    if (mm < 0) {
                        continue;
                    } else {
                        if (min == 0) {
                            min = mm;
                        } else if (mm < min) {
                            min = mm;
                        }
                    }
                }
                ++temp;
            }

            T[i] = min;
            min = 0;

        }


        return T;
    }
}