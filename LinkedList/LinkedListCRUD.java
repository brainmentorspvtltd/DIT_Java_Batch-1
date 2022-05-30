class GenericNode<T> {
    T data;
    GenericNode<T> next;
    GenericNode(T data) {
        this.data = data;
        this.next = null;
    }   
}

public class LinkedListCRUD<T> {
    private GenericNode<T> start;

    void insertAtBeg(GenericNode<T> node) {
        // If linked list is empty...
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;

    }

    void insertAtEnd(GenericNode<T> node) {
        // If linked list is empty...
        if(start == null) {
            start = node;
            return;
        }
        GenericNode<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void insertAtMid(GenericNode<T> node, int pos) {
        // If linked list is empty...
        if(start == null) {
            start = node;
            return;
        }
        if(pos == 0) {
            node.next = start;
            start = node;
        }

        if(pos > 0){
            int i = 1;
            GenericNode<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteInMid(int pos) {
        // If linked list is empty...
        if(start == null) {
            System.out.println("List is Empty...Can't delete");
            return;
        }
        GenericNode<T> temp = null;
        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }

        int i = 1;
        temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        GenericNode<T> slow;
        GenericNode<T> fast;
        if(start != null) {
            fast = slow = start;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Mid Point is : " + slow.data);
        }
    }

    void findNthFromEnd(int n) {
        GenericNode<T> p;
        GenericNode<T> q;
        p = q = start;
        for(int i = 1; i <= n; i++) {
            q = q.next;
        }
        while(q != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println(n + "element from end is : " + p.data);
    }

    void reverseIterate() {
        // If linked list is empty...
        if(start == null) {
            System.out.println("List is Empty...");
            return;
        }
        if(start.next == null) {
            System.out.println("List contains only one node...");
        }
        GenericNode<T> currentNode = start;
        GenericNode<T> previousNode = null;
        while(currentNode != null){ 
            GenericNode<T> nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        start = previousNode;
    }

    void detectLoop() {
        GenericNode<T> slow = start;
        GenericNode<T> fast = start;
        if(start != null) {
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    System.out.println("Cycle Present...");
                    return;
                }
            }
            System.out.println("No Cycle Detected...");
        }
    }

    void print() {
        GenericNode<T> current = start;
        while(current != null) {
            System.out.println(current.data + "," + current.next);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // GenericNode<String> n1 = new GenericNode<>("hello");
        LinkedListCRUD<Integer> operations = new LinkedListCRUD<>();
        operations.insertAtBeg(new GenericNode<Integer>(19));
        operations.insertAtBeg(new GenericNode<Integer>(29));
        operations.insertAtBeg(new GenericNode<Integer>(30));
        operations.insertAtBeg(new GenericNode<Integer>(15));

        operations.insertAtEnd(new GenericNode<Integer>(150));
        operations.insertAtMid(new GenericNode<Integer>(250), 3);

        operations.print();

    }
}
