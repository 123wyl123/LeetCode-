package Zero;

public class Rotate {
    public  ListNode RotateRight(ListNode head,int n )
    {   ListNode temp =head;
        int k= 0 ;
        ListNode tail = null;
        if (head==null)
        {
            return  null;
        }
        while (temp!=null)
        {   k++;
            tail = temp;
            temp=temp.next;

        }
            if(k<n)
            {
                return head;
            }

            temp =head;
            ListNode pre ;
            for(int i=0;i<k-n-1;i++)
            {   pre = temp;
                temp = temp.next;
            }
            pre = temp.next;
            temp.next = null;
            tail.next = head;
            return  pre;
    }
}
