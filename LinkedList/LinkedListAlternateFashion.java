class Node3 {
    int data;
    Node3 next;
    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListAlternateFashion {
    Node3 start;    // head of given single linked list
    Node3 tail;
    Node3 first = null, second = null, current;
    Node3 firstTail = null, secondTail = null;

    void approach() {
        current = start;
        boolean alternate = true;
        while(current != null) {
            move(current, alternate);
            current = current.next;
            alternate = !alternate;
        }
        System.out.println("First Linked List");
        print(first);

        System.out.println("Second Linked List");
        print(second);
    }

    void move(Node3 current, boolean alternate) {
        if(alternate) {
            if(first == null) {
                first = firstTail = current;
                return;
            }
            firstTail.next = current;
            firstTail = current;
        }
        else {
            if(second == null) {
                second = secondTail = current;
                return;
            }
            secondTail.next = current;
            secondTail = current;
        }
    }

    void add(int data) {
        // If linked list is empty...
        if(start == null) {
            tail = start = new Node3(data);
            return;
        }
        Node3 current = start;
        while(current.next != null) {
            current = current.next;
        }
        Node3 node = new Node3(data);
        tail.next = node;
        tail = node;
    }

    void print(Node3 start) {
        Node3 current = start;
        while(current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListAlternateFashion obj = new LinkedListAlternateFashion();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        // obj.add(70);

        obj.print(obj.start);
        System.out.println("====================");
        obj.approach();
    }

}
