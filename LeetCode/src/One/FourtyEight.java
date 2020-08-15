package One;
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class FourtyEight {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left!=null&&right!=null)
        {
            if(left.val<right.val)
            {
                h.next = left;
                left=left.next;
            }else
            {
                h.next = right;
                right=right.next;
            }
            h=h.next;
        }
        h.next=left!=null?left:right;
        return res.next;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        new FourtyEight().sortList(listNode);


    }
}
