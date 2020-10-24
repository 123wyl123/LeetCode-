package Ten;

import java.util.Arrays;

public class TwentyFour {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips,(int[]a ,int []b)->
                {
                    if (a[0]<b[0])
                    {
                        return -1;
                    }else if (a[0]==b[0])
                    {
                        return a[1]>b[1]?-1:1;
                    }else
                    {
                        return 1;
                    }
                });
            int a = clips[0][0];
            int b= clips[0][1];
            int temp = 1;
            if (a>0)
            {
                return -1;
            }
            a = b;
            if (b>=T)
            {
                return temp;
            }
        for (int i = 1; i <clips.length ; ) {
                if (clips[i][0]<=a)
                {
                    b= Math.max(b,clips[i][1]);
                    i++;
                }else
                {
                    if (b<clips[i][0])
                    {
                        return -1;
                    }
                    a = b;
                    temp++;
                    if (a>=T)
                    {
                        return temp;
                    }
                }

        }
    return b>=T?temp+1:-1;
    }


}
