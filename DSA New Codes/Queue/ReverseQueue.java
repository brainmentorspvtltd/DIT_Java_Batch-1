import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    static void reverse(Queue<Integer> q) {
        if(q.isEmpty()) {
            return;
        }
        int x = q.peek();
        q.remove();

        reverse(q);
        q.add(x);
    }

    static void print(Queue<Integer> q) {
        for (int x : q) {
            System.out.println(x + ",");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        reverse(q);
        print(q);

    }
}
