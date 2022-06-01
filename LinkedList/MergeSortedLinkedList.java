public class MergeSortedLinkedList {
    ListNode tail;
    void merge(ListNode start_1, ListNode start_2) {
        ListNode third, temp;
        if(start_1 == null) {
            print(start_2);
            return;
        }

        if(start_2 == null) {
            print(start_1);
            return;
        }

        if(start_1.data <= start_2.data) {
            third = start_1;
            start_1 = start_1.next;
        }
        else {
            third = start_2;
            start_2 = start_2.next;
        }
        temp = third;
        while(start_1 != null && start_2 != null) {
            if(start_1.data <= start_2.data) {
                temp.next = start_1;
                temp = temp.next;
                start_1 = start_1.next;
            }
            else {
                temp.next = start_2;
                temp = temp.next;
                start_2 = start_2.next;
            }
        }

    }

    void print(ListNode node) {

    }
}
