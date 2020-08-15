package One;

public class FourtySeven {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode pre = head;
        head=head.next;
        pre.next=null;
        while (head!=null)
        {
            if(head.val<=pre.val)
            {
                ListNode listNode3= head.next;
                head.next=pre;
                pre=head;
                head=listNode3;
            }else
            {   ListNode pre1 = pre;
                ListNode pre2=pre;

                while (pre2!=null&&head.val>pre2.val)
                {   pre1=pre2;
                    pre2=pre2.next;
                }
                ListNode listNode3= head.next;
                head.next=pre2;
                pre1.next=head;
                head=listNode3;
            }

        }
        return pre;
    }
}
