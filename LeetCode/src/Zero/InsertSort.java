package Zero;

public class InsertSort {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(head.val);
        ListNode pointer = head.next;
        // loop through each element in the list
        while (pointer != null) {   // insert this element to the new list
            ListNode innerPointer = newHead;
            ListNode next = pointer.next;
            if (pointer.val <= newHead.val) {
                ListNode oldHead = newHead;
                newHead = pointer;
                newHead.next = oldHead;
            } else {
                while (innerPointer.next != null) {
                    if (pointer.val > innerPointer.val && pointer.val <= innerPointer.next.val) {
                        ListNode oldNext = innerPointer.next;
                        innerPointer.next = pointer;
                        pointer.next = oldNext;
                    }
                    innerPointer = innerPointer.next;
                }
                if (innerPointer.next == null && pointer.val > innerPointer.val) {
                    innerPointer.next = pointer;
                    pointer.next = null;


                }
            }   // finally
            pointer = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
            InsertSort a =  new InsertSort();
            ListNode  b = new ListNode(1);
            ListNode c = new ListNode( 7);
            ListNode d = new ListNode(5);
            ListNode e = new ListNode(4);
            b.next = c;
            c.next = d;
            d.next = e;
            a.insertionSortList(b);
    }
}