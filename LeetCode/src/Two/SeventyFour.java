package Two;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeventyFour {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int temp=0;
        int length = citations.length;

        int l=1;
        int r=citations[length-1];
        while (l<=r)
        {
            int atemp = (r+l+1)/2;
            int dfs = dfs(citations,atemp);
            if (length-dfs>=atemp)
            {   temp=Math.max(atemp,atemp);
                l=atemp+1;
            }else
            {
                r=atemp-1;
            }
        }
        return temp;
    }
    public int dfs (int a[],int l)
    {
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>=l)
            {
                return i;
            }
        }
        return a.length;
    }
}
