class NodeLL {
    char data;
    NodeLL next;
    NodeLL(char data) {
        this.data = data;
    }
}

public class LinkedListPalindrome {
    private NodeLL start;

    NodeLL reverseList(NodeLL currentNode, NodeLL prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        NodeLL nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseList(nextNode, currentNode);
    }

    boolean palindrome() {
        NodeLL prev = null;
        NodeLL slow, fast;
        NodeLL midNode = null;
        slow = fast = start;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(fast != null) {
            midNode = slow;
            slow = slow.next;
        }

        NodeLL secondHalf = slow;
        prev.next = null;
        secondHalf = reverseList(secondHalf, null);
        boolean result = compare(start, secondHalf);
        secondHalf = reverseList(secondHalf, null);
        if(midNode != null) {
            prev.next = midNode;
            midNode.next = secondHalf;
        }
        return result;

    }

    boolean compare(NodeLL a, NodeLL b) {
        while(a != null && b != null) {
            if(a.data == b.data) {
                a = a.next;
                b = b.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
