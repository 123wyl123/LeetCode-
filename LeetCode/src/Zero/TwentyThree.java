package Zero;

public class TwentyThree {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        boolean flag = true;
        while (flag)
        {
            ListNode temp =null;
            int tempval = 0;
            for (int i = 0; i <lists.length ; i++) {
                if (lists[i]!=null&&temp==null)
                {
                    temp=lists[i];
                    tempval=i;
                }else if (lists[i]!=null&&temp!=null&&lists[i].val<temp.val)
                {
                    temp=lists[i];
                    tempval=i;
                }
            }
            if (temp==null)
            {
                flag=false;
            }else
            {
                cur.next=temp;
                cur=cur.next;
                lists[tempval]=lists[tempval].next;
            }

        }
        return listNode.next;
    }
}
