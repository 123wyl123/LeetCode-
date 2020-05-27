package Zero;

public class ReversePair {
    public static ListNode ReversePair(ListNode head)
    {
        ListNode  temp1 = null;
        ListNode  temp2 = null;
        ListNode next = null;
        while (head!=null&&head.next!=null)
        {
            if(temp1!=null)
            {
                temp1.next.next=head.next;
            }
            temp1 = head.next;

            head.next = temp1.next;
            temp1.next = head;
            if(temp2 == null)
            {
             temp2 = temp1;
            }
            head = head.next;
        }
        return  temp2;
    }

    public static ListNode ReversePairRecursive(ListNode head)
    {   if(head==null||head.next==null)
    {
        return null;
    }
        ListNode temp = null;
        ListNode temp1 = null;
        temp =head.next;
        temp1= temp.next;
        head.next = temp1;
        temp.next = head;
        head = temp;
        head.next.next=ReversePairRecursive(head.next.next);
        return  head;
    }

}
