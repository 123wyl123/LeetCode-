package One;

public class Reverse1 {
    ListNode GetKPlus(int K,ListNode head)
    {
        ListNode Kth;
        int i;
        if(head == null)
            return  head;
        for ( i =0,Kth=head;Kth!=null&&(i<K);i++,Kth=Kth.getNext())
        if (i==K&&Kth!=null)
        {
            return  Kth;
        }
        return  head.getNext();
    }
    Boolean HasKnodes(ListNode head,int K)
    {
        int i ;
        for (i=0;head!=null&&(i<K); i++,head=head.getNext());
            if(i==K)
            {
                return true;
            }
            else
            {
                return  false;
            }
    }
    ListNode ReverseBlock(ListNode head,int K)
    {
        ListNode temp,next,cur=head,newHead;
        if(K==0||K==1)
        {
            return  head;
        }
        if(HasKnodes(cur,K-1))
        {
            newHead = GetKPlus(K-1,cur);
        }
        else
        {
            newHead =head;
        }
        while (cur!=null&&HasKnodes(cur,K))
        {
            temp = GetKPlus(K,cur);
            int i  =0;
            while (i<K)
            {
                next = cur.getNext();
                cur.setNext(temp);
                temp = cur;
                cur =next;
                i++;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        Reverse1 m = new Reverse1();
        m.ReverseBlock(a,2);
    }
}
