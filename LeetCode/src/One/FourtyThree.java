package One;

import java.util.LinkedList;

public class FourtyThree {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null)
        {
         return ;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        LinkedList<ListNode> listNodes = new LinkedList<>();

        while (slow!=null)
        {
            listNodes.add(slow);
            slow=slow.next;
        }
        fast = head;
        ListNode last=listNodes.getLast();
        ListNode next=fast.next;
        while (!listNodes.isEmpty())
        {
            last = listNodes.removeLast();
             next = fast.next;
            fast.next = last;
            last.next = next;
            fast=next;

        }
        last.next=null;
    }


}
