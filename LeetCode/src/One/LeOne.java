package One;

import java.util.LinkedList;
import java.util.Queue;


public class LeOne {
    public boolean isSymmetric(TreeNode root) {
//        if(root==null)
//        {
//            return true;
//        }
//        LinkedList<TreeNode> a = new LinkedList<>();
//        a =  Inorder(root,root,a);
//        while (a.size()!=0)
//        { if(a.size()==1)
//        {
//            break;
//        }
//            if(a.getFirst()==null&&a.getLast()==null)
//            {
//                a.removeLast();
//                a.removeFirst();
//            }
//            else if(a.getFirst()==null||a.getFirst()==null)
//            {
//                return false;
//            }
//            else if(a.getFirst().val==a.getLast().val)
//
//            {
//                a.removeFirst();
//                a.removeLast();
//            }
//            else
//            {
//                return  false;
//            }
//        }
//        return  true;
        if (root == null) {
            return true;
        }
        return check(root, root);
    }

    public boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }





//        public LinkedList Inorder (TreeNode head1, TreeNode head2, LinkedList a)
//        {
//
//            if (head2 == null && (head1.left != null || head1.right != null)) {
//                a.add(head2);
//                return null;
//            }
//            if (head2 == null) {
//                return null;
//            }
//
//            Inorder(head2, head2.left, a);
//            a.add(head2);
//            Inorder(head2, head2.right, a);
//            return a;
//        }

        public static void main (String[]args){
//            TreeNode a = new TreeNode(1);
//            TreeNode b = new TreeNode(2);
//            TreeNode c = new TreeNode(2);
//            TreeNode d = new TreeNode(3);
//            TreeNode e = new TreeNode(4);
//            TreeNode f = new TreeNode(4);
//            TreeNode g = new TreeNode(3);

//            a.left = b;
//            a.right = c;
//            b.left = d;
//            b.right = e;
//            c.left = f;
//            c.right = g;
            TreeNode a = new TreeNode(1);
            TreeNode b = new TreeNode(2);
            TreeNode c = new TreeNode(2);
            TreeNode d = new TreeNode(2);
            TreeNode e = new TreeNode(2);
            a.left = b;
            a.right = c;
            b.left = d;
            c.left = e;
            LeOne bb = new LeOne();
            bb.isSymmetric(a);

        }
    }
