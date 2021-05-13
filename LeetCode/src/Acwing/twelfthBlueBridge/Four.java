package Acwing.twelfthBlueBridge;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Four {
    static class Node
    {
        public Node(long a, long b)
        {
            this.a = a;
            this.b = b;
        }
        long a;
        long  b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        long a[]=new long[n];
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        int b[][]= new int[m][4];

        int aa[]=new int[n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        HashMap<Integer, PriorityQueue<Node>> integerPriorityQueueHashMap;
        integerPriorityQueueHashMap = new HashMap<Integer, PriorityQueue<Node>>();
        for (int i = 0; i <m ; i++) {
          int i1 = b[i][1]- 1;
            int i2 = b[i][0];
            while (integerPriorityQueueHashMap.containsKey(i1)&& integerPriorityQueueHashMap.get(i1).size()!=0&&integerPriorityQueueHashMap.get(i1).peek().a<=b[i][0])
            {
                Node poll = integerPriorityQueueHashMap.get(i1).poll();
                a[ (i1)]+=poll.b;
            }
            if (a[ (i1)]<b[i][3])
            {
                System.out.println(-1);
            }else
            {
                if (integerPriorityQueueHashMap.containsKey(i1))
                {
                    PriorityQueue<Node> nodes = integerPriorityQueueHashMap.get(i1);
                    nodes.add(new Node(b[i][0]+b[i][2],b[i][3]));
                    integerPriorityQueueHashMap.put((i1),nodes);
                    a[(int) (i1)]-=b[i][3];
                    System.out.println(a[(int) (i1)]);
                }else
                {
                    PriorityQueue<Node> nodes = new PriorityQueue<Node>( (Node o1,Node o2)->{
                        return (int) (o1.a-o2.a);
                    });
                    nodes.add(new Node(b[i][0]+b[i][2],b[i][3]));
                    integerPriorityQueueHashMap.put((i1),nodes);
                    a[ (i1)]-=b[i][3];
                    System.out.println(a[(i1)]);
                }
            }

        }

    }
}