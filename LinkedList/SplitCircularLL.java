public class SplitCircularLL {
    ListNode start;
    ListNode tail;

    void splitCircular() {
        ListNode fast = start;
        ListNode slow = start;
        if(start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next == start) {
            fast = fast.next;
        }
        ListNode start_1 = start;
        ListNode start_2 = null;
        if(start.next != start) {
            start_2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = start;
    }

}
