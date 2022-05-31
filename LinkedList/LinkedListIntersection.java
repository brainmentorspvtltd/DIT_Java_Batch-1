class Node2 {
    int data;
    Node2 next;
    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntersection {

    private Node2 head_1;
    private Node2 head_2;

    int getSize(Node2 node) {
        int count = 0;
        Node2 current = node;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    int getNode() {
        int c1 = getSize(head_1);
        int c2 = getSize(head_2);
        int d;
        if(c1 > c2) {
            d = c1 - c2;
            return getIntersection(d, head_1, head_2);
        }
        else {
            d = c2 - c1;
            return getIntersection(d, head_1, head_2);
        }
    }

    int getIntersection(int d, Node2 head_1, Node2 head_2) {
        int i;
        Node2 current_1 = head_1;
        Node2 current_2 = head_2;
        for(i = 0; i < d; i++) {
            if(current_1 == null) {
                return -1;
            }
            current_1 = current_1.next;
        }
        while(current_1 != null && current_2 != null) {
            if(current_1.data == current_2.data) {
                return current_1.data;
            }
            current_1 = current_2;
            current_2 = current_2.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
