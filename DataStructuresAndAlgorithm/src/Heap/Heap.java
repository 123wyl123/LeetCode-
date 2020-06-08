package Heap;

public class Heap {
    public int[] array;
    public int count;
    public int capacity;
    public int heap_type;

    public Heap(int capacity, int heap_type) {
        this.heap_type = heap_type;
        this.capacity = capacity;
        this.count = 0;
        this.array = new int[capacity];
    }

    public int Parent(int i) {
        if (i <= 0 || i >= this.count) {
            return -1;
        }
        return (i - 1) / 2;
    }

    public int LeftChild(int i) {
        int left = 2 * i + 1;
        if (left >= this.count) {
            return -1;
        }
        return left;
    }

    public int RightChild(int i) {
        int right = 2 * i + 2;
        if (right >= this.count) {
            return -1;
        }
        return right;
    }

    public int GetMaximum(int i) {
        if (this.count == 0) {
            return -1;
        }
        return this.array[0];
    }

    public void PercolateDown(int i) {
        int l, r, max, temp;
        l = LeftChild(i);
        r = RightChild(i);
        if (i != -1 && this.array[l] > this.array[i]) {
            max = l;
        } else {
            max = i;
        }
        if (i != -1 && this.array[r] > this.array[max]) {
            max = r;
        } else {
            max = i;
        }
        if (max != i) {
            temp = this.array[i];
            this.array[i] = this.array[max];
            this.array[max] = temp;
        }
        PercolateDown(max);
    }

    public void insert(int data) {
        int i;
        if (this.count == this.capacity) {
            ResizeHeap();
        }
        this.count++;
        i = this.count - 1;
        while (i >= 0 && data > this.array[(i - 1) / 2]) {
            this.array[i] = this.array[(i - 1) / 2];
            i = (i - 1) / 2;
        }
        this.array[i] = data;

    }

    public void ResizeHeap() {
        int[] array_old = new int[this.capacity];
        System.arraycopy(this.array, 0, array_old, 0, this.count - 1);
        this.array = new int[this.capacity * 2];
        for (int i = 0; i < this.capacity; i++) {
            this.array[i] = array_old[i];
        }
        this.capacity = this.capacity * 2;
        array_old = null;


    }
    public int DeleMin()
    {
        if(this.count ==0)
        {
            return  -1;

        }
        int data = this.array[0];
        this.array[0] = this.array[this.count-1];
        this.count--;
        PercolateDown(0);
        return data;
    }
    public static void main(String[] args) {
        System.out.println("1");
    }
}
