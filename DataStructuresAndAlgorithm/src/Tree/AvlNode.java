package Tree;

public class AvlNode {
    int element;
    AvlNode left;
    AvlNode right;
    int height;

    AvlNode(int theElement) {
        this(theElement, null, null);
    }

    AvlNode(int theElement, AvlNode lt, AvlNode rt) {
        element = theElement;
        left = lt;
        right = rt;
        height = 0;
    }

    public int getHeight(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    public AvlNode insert(int x, AvlNode t) {
        if (t == null) {
            return new AvlNode(x, null, null);
        }
        int compareResult = Integer.toString(x).compareTo(Integer.toString(t.element));
        if (compareResult < 0) {
            t.left = insert(x, t.left);
        } else if (compareResult > 0) {
            t.right = insert(x, t.right);
        } else
            ;
        return balance(t);
    }

    private static final int ALLOWED_IMBALANCE = 1;

    public AvlNode balance(AvlNode t) {
        if (t == null)
            return t;
        if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE)
            if (height(t.left.left) >= height(t.left.right))
                t = rotateWithLeftChild(t);
            else
                t = doubleWithLeftChild(t);
        else if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE)
            if (height(t.right.right) >= height(t.right.left))
                t = rotateWithRightChild(t);
            else
                t = doubleWithRightChild(t);
        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;

    }

    private AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;

    }

    private AvlNode rotateWithRightChild(AvlNode k1) {
        AvlNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        return k2;
    }

    private AvlNode doubleWithLeftChild(AvlNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);

    }

    private AvlNode doubleWithRightChild(AvlNode k3) {
        k3.right = rotateWithLeftChild(k3.right);
        return rotateWithRightChild(k3);
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    private AvlNode remove(int x, AvlNode t) {
        if (t == null)
            return t;

        int compareResult = Integer.toString(x).compareTo(Integer.toString(t.element));
        if (compareResult < 0) t.left = remove(x, t.left);
        else if (compareResult > 0) t.right = remove(x, t.right);
        else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);

        } else t = (t.left != null) ? t.left : t.right;
        return balance(t);

    }

    private AvlNode findMin(AvlNode t)

    {
        if (t == null)  return null;
         else if (t.left == null)  return t;
         return findMin(t.left);

    }
}

