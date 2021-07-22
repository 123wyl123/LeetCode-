package One;

public class ThirtyEight {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return null;
        }
        HashMap<Node,Node> a =  new HashMap<Node,Node>();
        Node temp = new Node(head.val);
        Node cur =head.next;
        Node pre = temp;
        a.put(head, temp);
        while(cur!=null)
        {
            pre.next=new Node(cur.val);
            a.put(cur, pre.next);
            cur = cur.next;
            pre =pre.next;
        }
        cur =head;
        pre =temp;
        while(cur!=null)
        {
            Node t=cur.random;
            if(t!=null)
            {
                Node aa=a.get(t);
                pre.random=aa;
            }
            cur = cur.next;
            pre =pre.next;
        }
        return temp;
    }
}