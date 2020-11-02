package Five;

import java.util.HashMap;
import java.util.List;

public class FiftyFour {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <wall.size() ; i++) {
            int l =0;
            List<Integer> list = wall.get(i);

            for (int j = 0; j <list.size()-1 ; j++) {
                l+=list.get(j);
                integerIntegerHashMap.put(l,integerIntegerHashMap.getOrDefault(l,0)+1);
            }
        }
        int max =0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
            max = Math.max(integerIntegerHashMap.get(integer),max);
        }
    return wall.size()-max;
    }
}
