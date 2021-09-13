package Four;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FourSeven {
    public int numberOfBoomerangs(int[][] points) {

        int sum=0;
        for (int i = 0; i <points.length ; i++) {
            Map<Integer,Integer> a  =new HashMap<>();
            for (int[] point : points) {
                int dis = (point[0] - points[i][0]) * (point[0] - points[i][0]) + (point[1] - points[i][1]) * (point[1] - points[i][1]);
                a.put(dis,a.getOrDefault(dis,0)+1);
            }
            for (Integer integer : a.keySet()) {
                Integer integer1 = a.get(integer);
                sum=sum+(integer1)*(integer1-1);
            }
        }
        return sum;
    }


}
