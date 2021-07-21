package Sword;

import java.util.HashMap;
import java.util.Map;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class FiftyTwo {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int k=0;
        int k1=0;
        ListNode nextA =headA;
        ListNode nextB=headB;
        if(headA==null||headB==null)
        {
            return null;
        }
        while(nextA.next!=null)
        {
            nextA=nextA.next;
            k++;
        }
        while(nextB.next!=null)
        {
            nextB=nextB.next;
            k1++;
        }
        if(nextA!=nextB)
        {
            return null;
        }
        if(k>k1)
        {
            for(int i=0;i<k-k1;i++)
            {
                headA=headA.next;
            }
        }else if(k1>k)
        {
            for(int i=0;i<k1-k;i++)
            {
                headB=headB.next;
            }
        }
        for(int i=0;i<Math.min(k,k1);i++)
        {
            if(headB!=headA)
            {
                headA=headA.next;
                headB=headB.next;
            }else
            {
                return headB;
            }
        }

        return headA;



    }
}