package Fourteen;

import java.util.Arrays;

public class SixtyFive {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long sum =0;
        int length = verticalCuts.length;
        int width = horizontalCuts.length;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
       long sum1 =0;
       long sum2 = 0;
        for (int i = 0; i <width ; i++) {
            if (i==0)
            {
                sum1= horizontalCuts[0];
            }
            sum1 = Math.max(sum1,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        sum1 = Math.max(sum1,h-horizontalCuts[width-1]);
        for (int i = 0; i <length ; i++) {
            if (i==0)
            {
                sum2 = verticalCuts[0];
            }
            sum2 = Math.max(sum2,verticalCuts[i]-verticalCuts[i-1]);
        }
        sum2 = Math.max(sum2,w-verticalCuts[length-1]);
        return (int)((sum1*sum2)%1000000007);
    }
}
