package Zero;

public class FourtyOne {
    public boolean hasCycle(ListNode head) {
        if (head==null)
        {
            return false;
        }
        if (head.next!=null&&head.next==head)
        {
            return true;
        }
        ListNode before =head;
        ListNode after = head;

        while (after!=null&&before!=null&&after.next!=null)
        {
            before=before.next;
            after=after.next.next;
            if (before==after)
            {
                return true;
            }
        }
        return false;
    }
}
