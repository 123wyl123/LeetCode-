package Zero;

public class EightyTwo {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)
        {
            return head;
        }
        ListNode pre =null;

        ListNode cur = head;
        while (cur!=null)
        {
            if (cur.val==head.val&&(head.next!=null)&&cur.val==(cur.next.val))
            {
                while (cur.next!=null&&cur.val==(cur.next.val))
                {
                    cur=cur.next;
                }
                head=cur.next;
                cur=cur.next;


            }else if (cur.val==head.val)
            {
                head=head;
                pre=cur;
                cur = cur.next;
                pre.next=null;
            }
            else if (cur.next!=null&&cur.val==(cur.next.val))
            {
                while (cur.next!=null&&cur.val==(cur.next.val))
                {
                    cur=cur.next;
                }
                cur = cur.next;

            }else
            {
                pre.next = cur;
                pre =pre.next;
                cur=pre.next;
                pre.next=null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(2);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        new EightyTwo().deleteDuplicates(listNode);
    }
}

