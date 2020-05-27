package Zero;

import java.util.LinkedList;

public class ReorderLists {
    public void reorderList(ListNode head)
    {
        if(head == null)
        {
            return;
        }
        ListNode SlowPointer = head;
        ListNode FastPointer = head;
        while (SlowPointer!=null&&FastPointer.next!=null)
        {
            SlowPointer = SlowPointer.next;
            FastPointer = FastPointer.next.next;
        }
        ListNode head2 = SlowPointer.next;
        SlowPointer.next = null;
        LinkedList <ListNode> sta = new LinkedList<ListNode>();
        while (head2!=null)
        {ListNode temp = head2;
        head2 = head2.next;
        sta.push(temp);
        }
        while (!sta.isEmpty())
        {
            ListNode temp = sta.pop();
            temp.next = head.getNext();
            head.next = temp ;
            head = temp.getNext();

        }

    }
    public void reorderList1(ListNode head)
    {
        ListNode SlowNode =  head;
        ListNode FastNode = head;
        while (SlowNode!=null&&FastNode.next!=null)
        {
            SlowNode = SlowNode.next;
            FastNode = FastNode.next.next;
        }
        ListNode head2 = SlowNode.next;
        SlowNode.next = null;
        head2 = reversem(head2);
        alternate(head,head2);

    }
    public  ListNode reversem(ListNode head)
    {
        if(head==null)
        {
         return null;
        }

        ListNode pre   = null;
        ListNode next =null;
        while (head!=null)
        {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }
    public  ListNode alternate(ListNode head, ListNode head2)
    {
        ListNode temp = null;
        temp = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        if(head==null)
        {
            return null;
        }
        if(head2 == null)
        {
            return head;
        }
        while (head!=null&&head2!=null)
        {   temp1=head.next;
            temp2=head2.next;
            head2.next = head.next;
            head.next = head2;
            head = temp1;
            head2 = temp2;

        }
        return temp;
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
        ReorderLists r = new ReorderLists() ;
        r.reorderList1(a);
    }

}
