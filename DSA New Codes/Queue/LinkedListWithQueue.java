class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    Node front, rear;
    int size;
    QueueLL() {
        front = rear = null;
        size = 0;
    }

    void enqueue(int x) {
        Node temp = new Node(x);
        if(front == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        size++;
    }

    void dequeue() {
        if(front == null) {
            return;
        }
        front = front.next;
        if(front == null) {
            rear = null;
        }
    }

}

public class LinkedListWithQueue {
    
}
