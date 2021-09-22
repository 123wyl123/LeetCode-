package Seven;

public class TwentyFive {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode s[] = new ListNode[k];
        if (head==null)
        {
           return s;
        }
        int a[]=new int[k+1];
        int sum=0;
        ListNode pre =head;
        while (pre!=null)
        {
            pre =pre.next;
            sum++;
        }
        int geshu=sum/k;
        int shengyu=sum%k;
        for (int i =1 ; i <=k ; i++) {
            a[i]=geshu;
            if (shengyu>=i)
            {
                a[i]++;
            }
        }
         pre =null;
        ListNode cur =pre;
        for (int i = 1; i <=k ; i++) {
            int ss=0;
            s[i-1]=cur;
            while (ss<a[i])
            {   pre =cur;
                cur=cur.next;
                ss++;
            }
            pre.next=null;
        }
        return s;
    }
}
   class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }