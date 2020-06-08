package Two;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class LeThirtyFour {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        {
            return  true;
        }
        ListNode pre ;
        ListNode temp1 =null;
        ListNode temp;
        ListNode a = head;
        ListNode b =head;
        int i=0;
        ListNode m=null ;
        while(a!=null)
        {
            a=a.next;
            i++;
        }
        a=head;
        while (b!=null&&b.next!=null)
        {   m= a;
            a=a.next;
            b=b.next.next;

        }
        if(i%2==0)
        {
          pre = a;
        }
        else
        {
            pre = a.next;
        }
        m.next =null;
        while (pre!=null)
        {
            temp = pre.next;
            pre.next=  temp1;
            temp1 = pre;
            pre = temp;
        }
        while (head!=null&&temp1!=null)
        {
            if(temp1.val!=head.val)
            {
                return false;
            }
            head =head.next;
            temp1 = temp1.next;
        }

        return true;
    }



    public static void main(String[] args) {
        ListNode b= new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d= new ListNode(1);
//        ListNode e = new ListNode(1);
        b.next=c;
        c.next = d;
        d.next = null;
//        e.next =null;
        LeThirtyFour a = new LeThirtyFour();
        System.out.println(  a.isPalindrome(b));
    }
}
