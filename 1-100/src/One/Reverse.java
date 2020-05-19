package One;


import com.sun.org.apache.regexp.internal.REUtil;

public class Reverse {
    public  static ListNode reverseListIterative(ListNode head)
    {
        ListNode pre = null;
        ListNode next = null ;
        ListNode current = head;
        while (current!=null)
        {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
    public  static  void reverseListIterative1(ListNode current,ListNode head)
    {
        if(current==null)
        {return ;

        }
        ListNode next = current.getNext();
        if(next == null)
        {
         head = current;
         return;
        }

        reverseListIterative1(next,head);


        next.setNext(current);
        current.setNext(null);

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        ListNode e = null;
        reverseListIterative1(a,e);

    }
    }









//    public  static ListNode reverseListIterative(ListNode head)
//    {
////        ListNode temp1 = null;
////        ListNode temp2 = null;
////        while (head!=null&&head.next!=null)
////        {
////            if(temp1!=null)
////            {
////                temp1.next.next = head.next;
////            }
////            temp1 = head.next;
////            head.next = head.next.next;
////            temp1.next = head;
////            if(temp2==null)
////            {
////                temp2 = temp1;
////            }
////            head =head.next;
////        }
////        return  temp2;
//    }

//    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//
//        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
//        a.setNext(b);
//        b.setNext(c);
//        c.setNext(d);
////        reverseListIterative(a);
////    }
//}
