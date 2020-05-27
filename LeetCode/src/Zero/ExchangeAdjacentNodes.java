package Zero;

public class ExchangeAdjacentNodes {
    static  void   Exchange(ListNode head)
    {
        ListNode curNode,temp,nextNode;
        curNode = head;
        if(curNode==null||curNode.getNext()==null)
        {
            return;
        }
        head = curNode.getNext();
        while (curNode!=null&&curNode.getNext()!=null)
        {
            nextNode = curNode.getNext();
            curNode.setNext(nextNode.getNext());
            temp = curNode.getNext();
            nextNode.setNext(curNode);
            if(temp!=null&&temp.getNext()!=null)
            {
                curNode.setNext(curNode.getNext().getNext());

            }
            curNode = temp;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        ExchangeAdjacentNodes.Exchange(a);
    }
}
