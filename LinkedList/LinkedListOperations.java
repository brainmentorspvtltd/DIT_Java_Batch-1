class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(102);
        Node n3 = new Node(120);
        Node n4 = new Node(160);
        Node n5 = new Node(12);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node current = n1;
        while(current != null) {
            System.out.println(current.data + "," + current.next);
            current = current.next;
        }

    }
}