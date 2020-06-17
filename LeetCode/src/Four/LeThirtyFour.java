package Four;



import java.util.LinkedList;
import java.util.Queue;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class LeThirtyFour {
    public int pathSum(TreeNode root, int sum) {
        Queue<TreeNode> a = new LinkedList<>();
        a =  Preorder(root,a);
        int i =0;
        while (!a.isEmpty())
        {   i=i+countPath(a.poll(),sum);
        }
        return i;
    }
    public int Preorder(TreeNode root,int l,int m,int sum )
    {
        if(root == null)
        {
            return l;
        }
        m =m+root.val;
        if(m==sum)
        {
            l++;
        }


         l=Preorder(root.left,l,m,sum);
        l = Preorder(root.right,l,m,sum);


        return l;
    }
    public Queue Preorder(TreeNode root,Queue queue)
    {
        if(root == null)
        {
            return null;
        }
        queue.add(root);
        Preorder(root.left,queue);
        Preorder(root.right,queue);
        return queue;
    }
//if(root == null){
//        return 0;
//    }
//    int result = countPath(root,sum);
//    int a = pathSum(root.left,sum);
//    int b = pathSum(root.right,sum);
//        return result+a+b;
//
//}
    public int countPath(TreeNode root,int sum){
        if(root == null){
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0 ? 1:0;
        return result + countPath(root.left,sum) + countPath(root.right,sum);
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b= new TreeNode(5);
        TreeNode c = new TreeNode(-3);
        TreeNode d = new TreeNode(3);
        TreeNode e= new TreeNode(2);
        TreeNode f = new TreeNode(11);
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(-2);
        TreeNode i = new TreeNode(1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = g;
        d.right = h;
        c.right = f;
        e.right = i;
        LeThirtyFour mm = new LeThirtyFour();
        mm.pathSum(a,8);
    }
}
