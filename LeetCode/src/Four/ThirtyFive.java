package Four;

import java.util.Arrays;

public class ThirtyFive {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
        {
            return 0;
        }
        Arrays.sort(intervals,(int[] o1, int[] o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
        for (int[] interval : intervals) {
            System.out.println(interval[0]+"->"+interval[1]);
        }
        int[]a = new int[intervals.length];
        for (int i = 0; i <a.length ; i++) {
            a[i] =1;
        }
        for (int i = 1; i <intervals.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(intervals[i][0]>=intervals[j][1])
                {
                    a[i] = Math.max(a[i],1+a[j]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i <a.length ; i++) {
            res = Math.max(res,a[i]);
        }
        return intervals.length-res;
    }

    public static void main(String[] args) {
      int a[][] = { {1,2},{2,3}, {3,4}, {1,3}};
      new ThirtyFive().eraseOverlapIntervals1(a);
    }

    public int eraseOverlapIntervals1(int[][] intervals) {
        if(intervals.length==0)
        {
            return 0;
        }
        Arrays.sort(intervals,(int[] o1, int[] o2) -> o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1]
        );
        int res = 1;
        int pre =0;
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][0]>=intervals[pre][1])
            {
                res++;
                pre = i;
            }
        }
        return intervals.length-res;
    }
}
