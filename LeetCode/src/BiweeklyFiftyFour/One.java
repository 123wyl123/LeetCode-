package BiweeklyFiftyFour;

import java.util.Arrays;
import java.util.Comparator;

public class One {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0])
                {
                 return o1[0]-o2[0];
                }
                return o2[1]-o1[1];
            }
        });

        for (int i = left; i <=right ; i++) {
            boolean flag = false;
            for (int j = 0; j <ranges.length ; j++) {
                if ((ranges[i][0]==i||ranges[i][0]<i)&&(ranges[i][1]==i||ranges[i][1]>i))
                {       flag=true;
                    break;
                }else
                {
                    continue;
                }

            }
            if (!flag)
            {
                return false;
            }
        }
        return true;
    }
}

