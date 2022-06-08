import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    private int front;
    void enqueue(int data) {
        if(s1.isEmpty()) {
            front = data;
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }

    int dequeue() {
        if(s1.isEmpty()) {
            throw new RuntimeException("Queue is Empty...");
        }
        int data = s1.peek();
        s1.pop();
        return data;
    }

    public static void main(String[] args) {
        QueueUsingStack qs = new QueueUsingStack();
        qs.enqueue(10);
        qs.enqueue(20);
        qs.enqueue(30);
        qs.enqueue(40);

        System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());
        System.err.println(qs.dequeue());

    }

}
