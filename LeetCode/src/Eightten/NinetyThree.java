package Eightten;

import java.util.Arrays;

public class NinetyThree {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <=right ; i++) {
            boolean flag = false;
            for (int j = 0; j <ranges.length ; j++) {
                if ((ranges[j][0]==i||ranges[j][0]<i)&&(ranges[j][1]==i||ranges[j][1]>i))
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
