package Four;

import java.util.Arrays;

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



}
