package Eleven;

import java.util.PriorityQueue;

public class Zero {

    int max ;
    boolean [][] B;
    int [][] temp;
    public int maximumMinimumPath(int[][] A) {
        max =0;
        temp = new int[A.length][A[0].length];
        B = new boolean[A.length][A[0].length];
        dfs(A,0,0,A[0][0]);
        return max;
    }
    public void dfs(int [][] A,int i , int j,int k)
    {   if (i>=A.length||i<0||j<0||j>=A[0].length)
    {
        return;
    }
    if (k<=temp[i][j])
    {
        return;
    }
    temp[i][j]=k;
        if (i==A.length-1&&j==A[0].length-1)
        {
            max = k;

        }


        if (i+1<A.length)
        {   if (A[i+1][j]>max)
        {
            dfs(A,i+1,j,Math.min(k,A[i+1][j]));
        }

        }
        if (i-1>=0)
        {   if (A[i-1][j]>max)
        {
            dfs(A,i-1,j,Math.min(k,A[i-1][j]));
        }

        }
        if (j+1<A[0].length)
        {   if (A[i][j+1]>max)
        {
            dfs(A,i,j+1,Math.min(k,A[i][j+1]));
        }

        }
        if (j-1>=0)
        {   if (A[i][j-1]>max)
        {
            dfs(A,i,j-1,Math.min(k,A[i][j-1]));
        }

        }

    }
    class NodeP
    {
        int i;
        int j;
        int point;
        NodeP(int a,int b, int c)
        {
            this.i = a;
            this.j = b;
            this.point = c;
        }
    }
    public int maximumMinimumPath1(int[][] A) {
        int a[][] = {{0,1},{0,-1},{-1,0},{1,0}};
        PriorityQueue<NodeP> nodePS = new PriorityQueue<>((NodeP aa, NodeP b) ->
                Integer.compare(b.point,aa.point));
        int ans = A[0][0];
        int length = A.length;
        int length1 = A[0].length;
        nodePS.add(new NodeP(0,0,ans));
        boolean aa[][] = new boolean[length][length1];
        while (!nodePS.isEmpty())
        {
            NodeP q = nodePS.poll();
            ans =Math.min(q.point,ans);

            int x = q.i;
            int y = q.j;
            if (x==length-1&&y==length1-1)
            {
                return ans;
            }
            for (int i = 0; i <4 ; i++) {
                if (a[i][0]+x>=0&&a[i][0]+x<length&&a[i][1]+y>=0&&a[i][1]+y<length1&&!aa[a[i][0]+x][a[i][1]+y])
                {
                    nodePS.add(new NodeP(a[i][0]+x,a[i][1]+y,A[a[i][0]+x][a[i][1]+y]));
                    aa[a[i][0]+x][a[i][1]+y]=true;
                }

            }

        }
        return ans;
    }
}
