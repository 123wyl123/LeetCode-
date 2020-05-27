package Zero;

public class LeTwentyFour {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = null;
        ListNode next =null;
        temp = head.next;
        next = temp.next;
        head.next = next;
        temp.next = head;
        head = temp;
        head.next.next = swapPairs(head.next.next);
        return head;
    }
}
