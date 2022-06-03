public class TwoStack {

    int arr[];
    int capacity;
    int top_1, top_2;

    public TwoStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top_1 = -1;
        top_2 = capacity;
    }

    void push_1(int element) {
        if(top_1 < top_2 - 1) {
            top_1++;
            arr[top_1] = element;
        }
    }

    void push_2(int element) {
        if(top_1 < top_2 - 1) {
            top_2--;
            arr[top_2] = element;
        }
    }

    int pop_1() {
        if(top_1 >= 0) {
            int element = arr[top_1];
            top_1--;
            return element;
        }
        else {
            throw new RuntimeException("Stack_1 is empty...");
        }
    }

    int pop_2() {
        if(top_2 < capacity) {
            int element = arr[top_2];
            top_2++;
            return element;
        }
        else {
            throw new RuntimeException("Stack_2 is empty...");
        }
    }

    public static void main(String[] args) {
        TwoStack stack = new TwoStack(5);
        stack.push_1(10);
        stack.push_2(20);
        stack.push_1(30);
        stack.push_2(15);
        stack.push_2(11);

        System.out.println("Pop From Stack_1 : " + stack.pop_1());
        System.out.println("Pop From Stack_2 : " + stack.pop_2());

    }
}
