package Zero;

public class LeTwentyOne {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode pre = null;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                ListNode temp = l2.next;

                if (pre == null) {
                    pre = l2;
                    head = l2;
                    l2.next = l1;
                    l2 = temp;
                    continue;
                }
                l2.next = l1;
                pre.next = l2;
                pre = l2;
                l2 = temp;
            } else {
                pre = l1;
                l1 = l1.next;

            }
        }
        if (l2 != null) {
            pre.next = l2;
        }
        if (l1 != null) {
            pre.next = l1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
        LeTwentyOne m = new LeTwentyOne();
        System.out.println((m.mergeTwoLists(a, d)));
        LeTwentyOne m1 = new LeTwentyOne();
    }
}
