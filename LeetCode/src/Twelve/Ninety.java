package Twelve;
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Ninety {
    public int getDecimalValue(ListNode head) {
        int val =0;
        while (head!=null)
        {
            val =val*2+head.val;
            head=head.next;
        }
        return val;
    }
}
