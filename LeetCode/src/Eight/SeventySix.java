package Eight;
 class ListNode {
    int val;
     ListNode next;
    ListNode(int x) { val = x; }
}
public class SeventySix {
    public ListNode middleNode(ListNode head) {
        ListNode pre =head;
        ListNode after = head;
        while (after!=null&&after.next!=null)
        {
            pre= pre.next;
            after=after.next.next;
        }
        return pre;

    }
}
