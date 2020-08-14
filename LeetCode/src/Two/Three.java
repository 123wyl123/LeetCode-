package Two;

public class Three {
    public ListNode removeElements(ListNode head, int val) {

        if(head==null)
        {
            return null;
        }
        while (head!=null&&head.val==val)
        {
            head=head.next;
        }
        ListNode pre = head;
        ListNode pre1= head;
        while (head!=null)
        {
            if(head.val==val)
            {   pre1.next=head.next;
                head=pre1.next;

            }else
            {   pre1=head;
                head = head.next;
            }
        }
        return pre;
    }
}
