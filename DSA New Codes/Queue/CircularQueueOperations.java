class CircularQueue {
    int array[];
    int front;
    int rear;
    final int DEFAULT_CAPACITY = 10;
    public CircularQueue() {
        array = new int[DEFAULT_CAPACITY];
        rear = front = 0;
    }

    public CircularQueue(int capacity) {
        array = new int[capacity];
        rear = front = 0;
    }

    int getSize() {
        return rear;
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int data) {
        if(rear == array.length) {
            throw new RuntimeException("Queue is Full...");
        }
        int availableIndex = (front + rear) % array.length;
        array[availableIndex] = data;
        rear++;
    }

    int dequeue() {
        if(rear == 0){
            throw new RuntimeException("Queue is Empty...");
        }
        int value = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        rear--;
        return value;
    }

    void print() {
        for(int i = 0; i < rear; i++) {
            int availableIndex = (front + i) % array.length;
            System.out.println(array[availableIndex]);
        }
    }

}

public class CircularQueueOperations {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.print();

        cq.dequeue();
        cq.print();

        cq.enqueue(50);

    }
}
