package Two;

public class Four {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        head = next;
        while (next!= null) {
            if (pre != null) {
                if (next.next!= null) {
                    pre.next = next.next;
                } else {
                    pre.next = next;
                    return head;

                }
                cur = next;
                next = next.next;
            }

            pre = cur;
            cur = next;
            next = cur.next;
            cur.next = pre;
        }
        pre .next =null;
    return head;
    }



        }



