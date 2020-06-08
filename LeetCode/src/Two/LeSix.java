package Two;

public class LeSix {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = null;
        ListNode temp1;
        while (head != null) {
            temp1 = head.next;
            head.next = temp;
            temp = head;
            head = temp1;
        }
        return temp;
    }

    public ListNode reverseList1(ListNode head) {
        rever(head, head);
        return head;
    }

    public void rever(ListNode current, ListNode head) {
        if (current == null) {
            return;
        }

        ListNode next = current.next;
        if (next == null) {
            head = current;
            return;
        }
        rever(next, head);

        next.next = current;
        current.next = null;

    }

    public static void main(String[] args) {
        LeSix a = new LeSix();
        ListNode b= new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        b.next = c;
        c.next = d;
        a.reverseList1(b);
    }
}
