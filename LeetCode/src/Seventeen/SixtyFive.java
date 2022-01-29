package Seventeen;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SixtyFive {
    public int[][] highestPeak(int[][] isWater) {
        int length = isWater.length;
        int width = isWater[0].length;

        int a[][]={{0,1},{0,-1},{-1,0},{1,0}};
        boolean flag[][] = new boolean[length][width];
        int jilu[][] = new int[length][width];
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <width ; j++) {
                if (isWater[i][j]==1)
                {
                    queue.offer(new Node(i,j));
                }
            }
        }
        while (!queue.isEmpty())
        {
            Node poll = queue.poll();
            int tempi = poll.a;
            int tempj=poll.b;
            flag[tempi][tempj]=true;
            for (int i = 0; i <4 ; i++) {
                int i1=tempi+a[i][0];
                int j1=tempj+a[i][1];
                if (i1>=0&&i1<length&&j1>=0&&j1<width&&!flag[i1][j1]&&isWater[i1][j1]==0)
                {
                    flag[i1][j1]=true;
                    jilu[i1][j1]=jilu[tempi][tempj]+1;
                    queue.offer(new Node(i1,j1));
                }
            }
        }
        return jilu;
    }
    class Node
    {
        int a;
        int b;
         Node(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    }

    public static void main(String[] args) {
        int b[][]={{0,1},{0,0}};
        new SixtyFive().highestPeak(b);
    }
}