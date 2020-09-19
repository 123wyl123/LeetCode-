package Zero;

public class TwentyFive {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        if (head == null) {
            return null;
        }
        int x = 1;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size < k) {
            return head;
        }
        ListNode head1 = null;
        ListNode truehead = null;
        while (size >= k) {
            while (x != k) {
                pre = cur;
                cur = next;
                next = next.next;
                cur.next = pre;
                x++;
            }
            size -= k;
            x = 1;
            if (size >= k) {
                if (head1 == null) {
                    head1 = head;
                    truehead = cur;
                } else {
                    head1.next = cur;
                    head1 = head;
                }
                head = next;
                pre = cur;
                cur = next;
                next = next.next;
            } else {
                if (head1 == null) {
                    head.next = next;
                    truehead = cur;
                } else {
                    head.next = next;
                    head1.next = cur;
                    head1 = head;
                }
                break;
            }
        }
        return truehead;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        new TwentyFive().reverseKGroup(listNode, 2);
    }
}
