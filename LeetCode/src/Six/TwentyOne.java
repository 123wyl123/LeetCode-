package Six;

import java.util.PriorityQueue;

public class TwentyOne {
    public int leastInterval(char[] tasks, int n) {
        Node22 [] a  = new Node22[26];
        int length = tasks.length;
        for (int i = 0; i <length ; i++) {
            char task = tasks[i];
            if (a[task-'A']==null)
            {
                a[task-'A'] = new Node22(task-'A',1);
            }else
            {
                a[task-'A'].pinlv++;
            }
        }
        PriorityQueue<Node22> ab = new PriorityQueue<>((Node22 aa,Node22 bb)->
        {
            return bb.pinlv - aa.pinlv;
        });
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=null)
            {
                ab.add(a[i]);
            }
        }
        int sum =0;
        while (ab.size()>n)
        {      Node22 [] b=  new Node22[n+1];
            for (int i = 0; i <=n ; i++) {
                b[i] = ab.poll();
                b[i].pinlv--;
            }
            for (int i = 0; i <=n ; i++) {
                if (b[i].pinlv>0)
                {
                    ab.add(b[i]);
                }

            }
            sum+=n+1;
        }

        while (ab.size()>1)
        {
            int size = ab.size();
            Node22 [] b=  new Node22[size];
            for (int i = 0; i <size ; i++) {
                b[i] = ab.poll();
                b[i].pinlv--;
            }

            sum+=size;
            for (int i = 0; i <size ; i++) {
                if (b[i].pinlv>0)
                {
                    ab.add(b[i]);
                }
            }
            if (ab.size()!=0)
            {
                sum+=(n-size)+1;
            }
        }
        if (ab.size()==1)
        {
            return   sum+ab.peek().pinlv+(ab.peek().pinlv-1)*n;
        }
     return sum;
    }


}
class Node22
{
    int a;
    int pinlv;
    Node22(int a, int pinlv)
    {
        this.a = a;
        this.pinlv = pinlv;
    }

}
