package One;

import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      public  void setNext(ListNode a )
      {
          this.next = a;
      }
      public  ListNode getNext()
      {
          return this.next;
      }

  }


public class LeTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<ListNode> a = new <ListNode>ArrayList();
        int m = 0;
        while (l1 != null && l2 != null) {
            ListNode l3 = new ListNode(0);
            if ((l1.val + l2.val+m) < 10) {
                l3.val = l1.val + l2.val + m;
                m = 0;
            } else {
                l3.val = l1.val + l2.val - 10 + m;
                m = 1;
            }
            a.add(l3);


            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null) {
            if (m == 1) {
                ListNode addtion = new ListNode(m);
                a.get(a.size() - 1).next = addtion;
            }
        }

        if (l1 != null) {
            if (m == 0) {
                a.get(a.size() - 1).next = l1;
            } else {

                while (l1 != null) {
                    if (l1.val + m < 10) {
                        l1.val = l1.val + m;
                        m = 0;
                        a.add(new ListNode(l1.val));
                        break;
                    } else {
                        l1.val = l1.val + m - 10;
                        m = 1;
                        a.add(new ListNode(l1.val));
                    }
                    l1 = l1.next;
                }

            }

        }
        if (l2 != null) {
            if (m == 0) {
                a.get(a.size() - 1).next = l2;
            } else {
                while (l2 != null) {
                    if (l2.val + m < 10) {
                        l2.val = l2.val + m;
                        m = 0;
                        a.add(new ListNode(l2.val));
                        break;
                    } else {
                        l2.val = l2.val + m - 10;
                        m = 1;
                        a.add(new ListNode(l2.val));
                    }
                    l2 = l2.next;
                }
            }
        }

        for (int j = 0; j < a.size() - 1; j++) {
            a.get(j).next = a.get(j + 1);
        }
        if (m == 1) {
            a.get(a.size() - 1).next = new ListNode(m);
        }
        return a.get(0);

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(7);
        ListNode c =new ListNode(9);
        ListNode d=new ListNode(2);
        a.next =b ;
        c.next =d;
        LeTwo m = new LeTwo();

        System.out.println( m.addTwoNumbers(a,c));
    }
}

