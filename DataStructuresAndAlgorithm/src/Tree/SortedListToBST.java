package Tree;

public class SortedListToBST {
  public static   BinaryTreeNode SortedListToBST(ListNode list,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid = start+end;
        BinaryTreeNode leftChild = SortedListToBST(list,start,mid-1);
        BinaryTreeNode parent = new BinaryTreeNode();
        if(parent==null)
        {
            return null;
        }
        parent.setData(list.val);
        parent.setLeft(leftChild);
        list=list.next;
        parent.setRight(SortedListToBST(list,mid+1,end));
        return parent;
    }
  public static   BinaryTreeNode SortedListToBST(ListNode head,int n )
    {
        return SortedListToBST(head,0,n-1);
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next=b;
        b.next=c;
        SortedListToBST(a,3);
    }
}
