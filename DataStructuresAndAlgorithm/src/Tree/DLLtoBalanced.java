package Tree;


 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



  class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1(int x) { val = x; }
  }

public class DLLtoBalanced {
    public TreeNode1 sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode1(head.val);
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre=null;
        while(fast!= null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;

        TreeNode1 cur = new TreeNode1(slow.val);

        if(head != slow) {
            if(pre!=null)
            {
                pre.next=null;
            }
            cur.left = sortedListToBST(head);
        }

            cur.right = sortedListToBST(fast);


        return cur;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(-10);
        ListNode b = new ListNode(-3);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        DLLtoBalanced m = new DLLtoBalanced();
        m.sortedListToBST(a);
    }
}
