package Sixteen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ThirtyOne {

    public int minimumEffortPath(int[][] heights) {
        int length = heights.length;
        int length1 = heights[0].length;
        boolean visited[][] = new boolean[length][length1];
        int distance[][] = new int[length][length1];
        int [][]dir = {{0,1}, {1,0}, {0, -1}, {-1,0}};
        PriorityQueue<int[]> ints = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[2]));
        for (int[] ints1 : distance) {
            Arrays.fill(ints1,Integer.MAX_VALUE);
        }
        ints.add(new int[]{0,0,0});
        distance[0][0] = 0;
        while (!ints.isEmpty())
        {
            int[] poll = ints.poll();
            int curx = poll[0];
            int cury = poll[1];
            visited[curx][cury] = true;
            if(curx==length-1 && cury==length1-1) return poll[2];
            for (int[] ints1 : dir) {
                int nextX = curx + ints1[0];
                int nextY = cury+ ints1[1];
                if (nextX>=0&&nextX<length&&nextY>=0&&nextY<length1&&!visited[nextX][nextY])
                {
                    int curdiff = Math.abs(heights[curx][cury]-heights[nextX][nextY]);
                    int maxDiff = Math.max(curdiff,distance[curx][cury]);
                    if (maxDiff<distance[nextX][nextY])
                    {
                        distance[nextX][nextY]=maxDiff;
                        ints.add(new int[]{nextX,nextY,maxDiff});
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int a[][] = {{1,2,3},{3,8,4},{5,3,5}};
        new ThirtyOne().minimumEffortPath(a);
    }
}
