package BiweeklyFiftySeven;

import java.util.LinkedList;
import java.util.List;

public class Three {
    public List<List<Long>> splitPainting(int[][] segments) {
        int max =0;
        for (int i = 0; i <segments.length ; i++) {
            max =Math.max(segments[i][1],max);
        }
        long a[]=new long[100005];
        long b[]=new long[100005];
        boolean du[]=new boolean[100005];
        b[0]=0;
        for (int i = 1; i <=max ; i++) {
            b[i]=a[i]-a[i-1];
        }
        for (int i = 0; i <segments.length ; i++) {
            int[] segment = segments[i];
            b[segment[0]]+=segment[2];
            b[segment[1]]-=segment[2];
            du[segment[1]]=true;
        }
        for (int i = 1; i <= max; i++)
        {
            a[i]=b[i]+a[i-1];
        }
        List<List<Long>> linkedLists = new LinkedList<>();
        int pre =1;
        for (int i =1 ; i <=max ; i++) {
            if (a[i]==a[pre]&&du[i]==false)
            {
            }else
            {
                LinkedList<Long> longs = new LinkedList<>();
                longs.addLast((long) pre);
                longs.addLast((long)i);
                longs.addLast(a[pre]);
                if (a[pre]==0)
                {
                    pre =i;
                    continue;
                }else
                {
                    linkedLists.add(longs);
                    pre =i;
                }
            }
        }
        return linkedLists;
    }
}
