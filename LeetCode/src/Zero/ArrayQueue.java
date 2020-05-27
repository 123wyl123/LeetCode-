package Zero;

public class ArrayQueue {
    private int front;
    private int rear;


    private int capacity;
    private int[] arrayQueue;

    private ArrayQueue(int size) {
        capacity = size;
        arrayQueue = new int[size];
        front = -1;
        rear = -1;
    }


    public boolean isEmpty() {
        return (front == -1);
    }


    public boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    public int arrayPoll() {
        if (isEmpty()) {
            throw new NullPointerException("队列已经空了！");
        }
        int data = arrayQueue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }


    public int arrayOffer(int element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("队列已满！");
        }

        rear = (rear + 1) % capacity;
        arrayQueue[rear] = element;
        if (front == -1) {
            front = rear;
        }
        return arrayQueue[front];
    }

    /**
     * 获取队首元素
     *
     * @return
     * @author Administrator@2018年12月12日 下午8:37:53
     */
    public int arrayPeek() {
        if (isEmpty()) {
            throw new NullPointerException("队列已经空了！");
        }
        return arrayQueue[front];
    }


    public int arrayQueueCapicity() {
        return (rear - front + 1 + capacity) % capacity;
    }


    public static void main(String[] args) {
        ArrayQueue a = new ArrayQueue(4);
        a.arrayOffer(1);
        a.arrayOffer(2);
        a.arrayPoll();
        a.arrayPoll();
        a.arrayPoll();
    }
}
