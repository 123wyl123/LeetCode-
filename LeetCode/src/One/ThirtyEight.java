package One;

import java.util.HashMap;
class Node12 {
    int val;
    Node12 next;
    Node12 random;

    public Node12(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class ThirtyEight {
    public Node12 copyRandomList(Node12 head) {
        if(head==null)
        {
            return null;
        }
        HashMap<Node12,Node12> a =  new HashMap<Node12,Node12>();
        Node12 temp = new Node12(head.val);
        Node12 cur =head.next;
        Node12 pre = temp;
        a.put(head, temp);
        while(cur!=null)
        {
            pre.next=new Node12(cur.val);
            a.put(cur, pre.next);
            cur = cur.next;
            pre =pre.next;
        }
        cur =head;
        pre =temp;
        while(cur!=null)
        {
            Node12 t=cur.random;
            if(t!=null)
            {
                Node12 aa=a.get(t);
                pre.random=aa;
            }
            cur = cur.next;
            pre =pre.next;
        }
        return temp;
    }
}