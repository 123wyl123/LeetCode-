package Nine;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class Nine {
    public int snakesAndLadders(int[][] board) {
        int tempp=0;
        Deque<Integer> a = new LinkedList<>();
        a.addLast(1);
        int kk = board.length%2==1?board.length*(board.length-1)+1:board.length*board.length;
        HashSet<Integer> integers = new HashSet<>();
        integers.add(0);
        int aa[]=new int[board.length*board.length];
        boolean flag=true;
        int k=0;
        for (int i = board.length-1; i >=0 ; i--) {

            int j;
            int ii=0;
            int l=0;
            if (flag)
            {
                j=0;
                ii=1;
                l=board[0].length;
            }else
            {   ii=-1;
                j=board[0].length-1;
                l=-1;
            }

            for (; j!=l ; j+=ii) {
                aa[k++]=board[i][j];
            }
            flag=!flag;
        }
        while (!a.isEmpty())
        {   tempp++;
            int size = a.size();
            for (int i = 0; i <size ; i++) {
                Integer integer = a.removeFirst();
                for (int j = 1; j <=6 ; j++) {
                    int j1 = j+integer;
                    int i1 = aa[j1 - 1];
                    if (i1==-1)
                    {   if (!integers.contains(j1))
                    {
                        a.addLast(j1);
                        integers.add(j1);
                    }

                    }else
                    {   if (!integers.contains(i1))
                    {
                        a.addLast(i1);
                        integers.add(i1);
                    }

                    }
                    if (i1==board.length*board.length||j1==board.length*board.length)
                    {
                        return tempp;
                    }
                }
            }

        }
        return -1;
    }
}