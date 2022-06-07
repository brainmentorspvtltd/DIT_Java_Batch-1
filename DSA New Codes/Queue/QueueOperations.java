class Queue {
    int data[];
    int front;
    int rear;
    int size;
    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getFront() {
        if(size == 0) {
            throw new RuntimeException("Queue is empty...");
        }
        return data[front];
    }

    void enqueue(int e) {
        if(size == data.length) {
            throw new RuntimeException("Queue is empty...");
        }
        if(size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length) {
            rear = 0;
        }
        data[rear] = e;
    }

    int dequeue() {
        if(size == 0) {
            throw new RuntimeException("Queue is empty...Cannot Dequeue...");
        }
        int temp = data[front];
        front++;
        if(front == data.length) {
            front = 0;
        }
        size--;
        if(size == 0) {
            front = rear = -1;
        }
        return temp;
    }

    void print() {
        while(!isEmpty()) {
            System.out.println(dequeue());
        }
    }

}

public class QueueOperations {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.print();
        // q.dequeue();
        // q.dequeue();
    }
}