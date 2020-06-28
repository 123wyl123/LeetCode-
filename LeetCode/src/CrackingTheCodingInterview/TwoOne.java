package CrackingTheCodingInterview;

import java.util.HashSet;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class TwoOne {
    public ListNode removeDuplicateNodes(ListNode head) {
   ListNode     temp = head;
   ListNode  temp1 = head;
        HashSet <Integer>a = new HashSet();
        while (head!=null)
        {  if(a.contains(head.val))
        {   temp1 .next = head.next;

            head=head.next;

        }
        else
        {   a.add(head.val);
            temp1 = head;
            head=head.next;

        }


        }
        return temp;

    }
}
