package One;

import java.util.HashMap;

public class Sixty {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Boolean> listNodeHashMap = new HashMap<ListNode, Boolean>();
        while (headA!=null)
        {
            listNodeHashMap.put(headA,true);
            headA=headA.next;
        }
        while (headB!=null)
        {
            if (listNodeHashMap.containsKey(headB))
            { 
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
