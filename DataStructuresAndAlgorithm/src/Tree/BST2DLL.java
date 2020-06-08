package Tree;

import java.util.LinkedList;
import java.util.Queue;


class Node1 {
    public int data;
    public Node1 left;
    public Node1 right;

    public Node1(int data) {
        this.data = data;
    }
}

class RetrunType {
    public Node1 start;
    public Node1 end;

    public RetrunType(Node1 start, Node1 end) {
        this.start = start;
        this.end = end;
    }
}

public class BST2DLL {
    public Node1 convert1(Node1 head) {
        Queue<Node1> queue = new LinkedList<Node1>();
        inOrderToQueue(head, queue);
        if (queue.isEmpty()) {
            return head;
        }
        head = queue.poll();
        Node1 pre = head;
        pre.left = null;
        Node1 cur = null;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }
        pre.right = null;
        return head;
    }

    public void inOrderToQueue(Node1 head, Queue<Node1> queue) {
        if (head == null) {
            return;
        }
        inOrderToQueue(head.left, queue);
        queue.offer(head);
        inOrderToQueue(head.right, queue);
    }

    public Node1 convert2(Node1 head) {
        if (head == null) {
            return null;
        }
        return process(head).start;
    }

    public RetrunType process(Node1 head) {
        if (head == null) {
            return new RetrunType(null, null);
        }
        RetrunType leftList = process(head.left);
        RetrunType rightList = process(head.right);
        if (leftList.end != null) {
            leftList.end.right = head;
        }
        head.left = leftList.end;
        head.right = rightList.start;
        if (rightList.start != null) {
            rightList.start.left = head;
        }
        return new RetrunType(leftList.start != null ? leftList.start : head, rightList.end != null ? rightList.end : head);
    }


}
