package Zero;

public class SixtyOne {
    public ListNode rotateRight(ListNode head, int k) {
        if (k==0||head==null)
        {
            return head;
        }
        ListNode pre =head;
        ListNode cur =head;
        int i =0;
        while (cur!=null)
        {
            i++;
            pre=cur;
            cur=pre.next;
        }

        if (i==1||k%i==0)
        {
            return head;
        }
        i=i-(k%i);

        ListNode hehe = pre;
        pre =head;
        cur = head;
        while (cur!=null&&i!=0)
        {
            i--;
            pre=cur;
            cur = cur.next;
        }
        pre.next = null;
        hehe.next=head;
       return cur;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next=listNode1;
        new SixtyOne().rotateRight(listNode,1);
    }
}
