package Zero;

public class EightyThree {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode next =head;
        while (cur!=null)
        {
            if (cur.next!=null&&cur.val==cur.next.val)
            {
                cur=cur.next;

            }else
            {
                if (pre==null)
                {
                    pre =cur;
                    head = pre;
                    cur = cur.next;
                }else
                {
                    pre.next = cur;
                    pre = cur;
                    cur = cur.next;
                }
            }

        }
        return head;
    }
}
