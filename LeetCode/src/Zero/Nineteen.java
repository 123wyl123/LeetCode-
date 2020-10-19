package Zero;

public class Nineteen {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode ew = head;
        ListNode pre =head;
        while (pre!=null&&n!=0)
        {
            pre =pre.next;
            n--;
        }
        if (pre==null)
        {
            head=head.next;
            ew = null;
            return head;
        }
        while (pre.next!=null)
        {
            head=head.next;
            pre=pre.next;
        }
        head.next = head.next.next;
        return ew;
    }
}
