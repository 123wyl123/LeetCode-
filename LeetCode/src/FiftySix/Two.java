package FiftySix;

import java.util.Deque;
import java.util.LinkedList;

public class Two {
    int k =Integer.MAX_VALUE;
    int i1;
    int j1;
    public int nearestExit(char[][] maze, int[] entrance) {
        boolean flag [][]=new boolean[maze.length][maze[0].length];
        int ba[][]={{1,0},{-1,0},{0,1},{0,-1}};
                int l = maze.length;
                int w= maze[0].length;
                i1=entrance[0];
                j1=entrance[1];
        Deque<Node> nodes = new LinkedList<>();
        nodes.addFirst(new Node(i1,j1));
        int temp=0;
        while (!nodes.isEmpty())
        {
            int size = nodes.size();
            for (int m = 0; m <size ; m++) {

                Node node = nodes.poll();
                int i = node.i;
                int j = node.j;

                if ((i==0||j==0||i==l-1||j==w-1)&&(i!=i1||j!=j1))
                {
                    return temp;
                }
                for (int n = 0; n <4 ; n++) {
                    int[] ints = ba[n];
                   int tempi= ints[0]+i;
                   int tempj=ints[1]+j;
                   if (tempi>=l||tempi<0||tempj>=w||tempj<0)
                   {
                       continue;
                   }
                   if (flag[tempi][tempj]||maze[tempi][tempj]=='+')
                   {
                       flag[tempi][tempj]=true;
                   }else if (!flag[tempi][tempj])
                   {flag[tempi][tempj]=true;
                       nodes.offer(new Node(tempi,tempj));
                   }
                }
            }
            temp++;
        }
       return  -1;
    }


}

class Node
{
    int i;
    int j;
    Node(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}