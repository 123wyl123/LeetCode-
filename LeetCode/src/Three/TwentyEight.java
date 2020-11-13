package Three;
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class TwentyEight {
    public ListNode oddEvenList(ListNode head) {
        if (head==null)
        {
            return null;
        }
        ListNode Node1 = head;
        ListNode Node2 = head.next;
        ListNode Node2t = Node2;
        if (Node2==null)
        {
            return head;
        }
        while (Node2!=null&&Node2.next!=null)
        {
            Node1.next = Node2.next;
            Node1= Node1.next;
            Node2.next = Node1.next;
            Node2 = Node2.next;
        }
        Node1.next = Node2t;
        return head;
    }
}
