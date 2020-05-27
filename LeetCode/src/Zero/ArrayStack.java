package Zero;

public class ArrayStack {
    private int top;
    private int capacity;
    private  int[] array;
    public ArrayStack()
    {

        capacity = 1;
        array = new int[capacity];
        this.top = -1;
    }
    public boolean isEmpty()
    {
        return (this.top==-1);
    }
    public boolean isStackFull()
    {
        return this.top==capacity-1;
    }
    public int pop()
    {
        if(this.top==-1)
        {
            return  0;
        }
        else
        {
            return  array[top--];

        }
    }
    public void doubleStack()
    {
        int newArray[]  = new int[capacity*2];
        System.arraycopy(array,0,newArray,0,capacity);
        capacity = capacity*2;
        array = newArray;
    }
    public void push(int data)
    {
        if(this.isStackFull())
        {
        this.doubleStack();
        array[++top] = data;
        }
        else
        {
            array[++top] = data;
        }
    }
    public void deleteStack()
    {
        top = -1;
    }
}
