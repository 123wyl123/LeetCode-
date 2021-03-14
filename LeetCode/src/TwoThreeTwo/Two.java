package TwoThreeTwo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Two {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Node> nodes = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                double aa = (o1.a+1) / (o1.b +1);
                double aaa = o1.a/o1.b;
                double bb = (o2.a+1)/(o2.b+1);
                double bbb =o2.a/o2.b;
                if (aa-aaa>bb-bbb)
                {
                    return -1;
                }else
                {
                    return 1;
                }
            }
        });
        int temp =0;
        for (int i = 0; i <classes.length ; i++) {
            if (classes[i][0]==classes[i][1])
            {
               temp++;
            }else
            {
                nodes.add(new Node(classes[i][0],classes[i][1]));
            }
        }
        while (!nodes.isEmpty()&&extraStudents>0)
        {
            Node poll = nodes.poll();
            poll.b++;
            poll.a++;
            nodes.add(poll);
            extraStudents--;
        }
        double temp1 =0;
        while (!nodes.isEmpty())
        {
            Node poll = nodes.poll();
            temp1=temp1+(double) poll.a/poll.b;
        }
        temp1=temp1+temp;
        return temp1/classes.length;
    }
    class Node
    {
        double a;
        double b;
        Node (double a,double b)
        {
            this.a = a;
            this.b =b;
        }
    }

    public static void main(String[] args) {
    int a[][]=  {{2,4},{3,9},{4,5},{2,10}};
        new Two().maxAverageRatio(a,2);
    }
}
