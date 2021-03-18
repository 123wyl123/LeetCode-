package Zero;


public class NinetyTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre   = head;
        ListNode start = head;
        int temp =1;
        if (left==right)
        {
            return head;
        }
        while (temp!=left)
        {   pre =start;
            start=start.next;
            temp++;
        }
        ListNode next = start;
        ListNode cur = start;
        ListNode nextnext = start;
        ListNode pre1 = null;
        temp--;
        while (temp!=right)
        {
           next = cur.next;
            cur.next =pre1;
            pre1 =cur;
            cur = next;
            temp++;
        }
        if (left!=1)
        {
            pre.next = pre1;
            start.next=next;
            return head;
        }else
        {
            start.next =next;
            return pre1;
        }


    }


}
