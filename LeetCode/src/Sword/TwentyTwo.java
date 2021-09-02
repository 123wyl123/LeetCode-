package Sword;

public class TwentyTwo {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode = new ListNode(-1);
        listNode.next=head;
        ListNode nextk=listNode;
        for (int i = 0; i <k ; i++) {
            nextk=nextk.next;
        }
        while (nextk!=null)
        {
            nextk=nextk.next;
            listNode=listNode.next;
        }
        return listNode;
    }
}
