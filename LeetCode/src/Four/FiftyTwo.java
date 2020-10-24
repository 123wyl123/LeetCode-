package Four;

import java.util.Arrays;
import java.util.Comparator;

public class FiftyTwo {
    public int findMinArrowShots(int[][] points) {
        if (points.length==0)
        {
            return 0;
        }
        Arrays.sort(points,(int a[],int b[])->
                {
                    if (a[0]<b[0])
                    {
                        return -1;
                    }else if (a[0]==b[0])
                    {
                        return a[1]>b[1]?1:-1;
                    }else
                    {
                        return 1;
                    }
                }
        );

        int min = points[0][1];
        int temp = 0;
        for (int i = 1; i <points.length ; i++) {
            if (points[i][0]==points[i-1][0])
            {    min  = Math.min(points[i][1],min);
                continue;

            }else if (points[i][0]<=min)
            {
                min  = Math.min(points[i][1],min);
                continue;
            }else
            {
                temp++;
                min = points[i][1];
            }

        }
        return temp+1;
    }
    public int findMinArrowShots1(int[][] points) {
        int len = points.length;
        if (len < 2) {
            return len;
        }

        // 按照区间终点进行排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[1] != point2[1]) {
                    return point1[1] - point2[1];
                }
                return point1[0] - point2[0];
            }
        });

        int count = 1;
        int end = points[0][1];
        for (int i = 1; i < len; i++) {
            if (points[i][0] > end) {
                // 就得多用一支箭
                end = points[i][1];
                count++;
            }
        }
        return count;
    }


}
