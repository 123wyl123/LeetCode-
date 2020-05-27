package Zero;


    class DynamicArrayQueue {

        private int front;

        private int rear;

        private int capacity;

        private int[] array;



        public DynamicArrayQueue() {

            capacity = 1;

            front = -1;

            rear = -1;

            array = new int[1];

        }



        public boolean isEmpty() {    //判断是否为空

            return (front == -1);

        }



        public boolean isFull() {      //判断队列是否已满

            return ((rear + 1) % capacity == front);

        }



        public int getQueueSize() {     //队列的大小

            if (front == -1) {

                return 0;

            }

            int size = ((capacity - front + rear + 1) % capacity);

            if (size == 0) {

                return capacity;

            } else {

                return size;

            }

        }



        private void resizeQueue() {          //改变队列的大小

            int iniCapacity = capacity;

            capacity *= 2;

            int[] oldArray = array;

            array = new int[this.capacity];

            for (int i = 0; i < oldArray.length; i++) {

                array[i] = oldArray[i];

            }

            if (rear < front) {

                for (int i = 0; i < front; i++) {

                    array[i + iniCapacity] = this.array[i];

                    array[i] = 0;

                }

                rear = rear + iniCapacity;

            }

        }



        public void enQueue(int date) {         //入队

            if (isFull()) {

                resizeQueue();

            }

            rear = (rear + 1) % capacity;

            array[rear] = date;

            if (front == -1) {

                front = rear;

            }

        }



        public int deQueue() {      //出队

            int date = 0;

            if (isEmpty()) {

                System.out.println("Over Flow");

            } else {

                date=array[front];

                if(front==rear){

                    front=rear=-1;

                }else {

                    front=(front+1)%capacity;

                }

            }

            return date;

        }
        public static void main(String[] args) {

            // write your code here

            DynamicArrayQueue dynamicArrayQueue=new DynamicArrayQueue();

            dynamicArrayQueue.enQueue(1);

            dynamicArrayQueue.enQueue(2);

            dynamicArrayQueue.enQueue(3);

            dynamicArrayQueue.enQueue(4);
            dynamicArrayQueue.enQueue(5);
            dynamicArrayQueue.enQueue(6);
            dynamicArrayQueue.enQueue(7);
            dynamicArrayQueue.deQueue();
            dynamicArrayQueue.deQueue();
            dynamicArrayQueue.enQueue(8);
            dynamicArrayQueue.enQueue(9);
            dynamicArrayQueue.enQueue(10);
            dynamicArrayQueue.enQueue(11);
            System.out.println(dynamicArrayQueue.getQueueSize());

            System.out.println(dynamicArrayQueue.deQueue());

            System.out.println(dynamicArrayQueue.deQueue());

            System.out.println(dynamicArrayQueue.deQueue());

            System.out.println(dynamicArrayQueue.deQueue());

        }
    }












