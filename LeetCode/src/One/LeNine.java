package One;



 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class LeNine {
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return new TreeNode(head.val);
            ListNode slow = head;
            ListNode fast = head;
            ListNode pre = null;
            while (fast != null && fast.next != null) {
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            fast = slow.next;

            TreeNode cur = new TreeNode(slow.val);

            if (head != slow) {
                if (pre != null) {
                    pre.next = null;
                }
                cur.left = sortedListToBST(head);
            }

            cur.right = sortedListToBST(fast);


            return cur;
        }
    }
}
