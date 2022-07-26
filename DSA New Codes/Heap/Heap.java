import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> data = new ArrayList<>();
    void add(int item) {
        // element is added in an array list
        data.add(item);
        // calling heapify
        upHeapify(data.size() - 1);
    }

    void upHeapify(int childIndex) {
        // compute parent index first
        int parentIndex = (childIndex - 1) / 2;
        // compare child data must be smaller than parent
        // otherwise swap the value
        if(data.get(childIndex) < data.get(parentIndex)) {
            swap(parentIndex, childIndex);
            upHeapify(parentIndex);
        }
    }

    void swap(int parentIndex, int childIndex) {
        int parentValue = data.get(parentIndex);
        int childValue = data.get(childIndex);
        data.set(childIndex, parentValue);
        data.set(parentIndex, childValue);
    }

    int delete() {
        // swap 0th element with last element
        swap(0, data.size() - 1);
        // remove the last element
        int lastElement = data.remove(data.size() - 1);
        // Do Down Heapify
        downHeapify(0);
        return lastElement;
    }

    void downHeapify(int parentIndex) {
        // get left and right child indexes
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        // conside minIndex the smaller index value
        int minIndex = parentIndex;
        // if left child index is less than array size and left child index
        // is less than parent node value, then store left child index
        if(leftChildIndex < data.size() - 1 && data.get(leftChildIndex) < data.get(parentIndex)) {
            minIndex = leftChildIndex;
        }

        // if right child index is less than array size and right child index
        // is less than parent node value, then store right child index
        if(rightChildIndex < data.size() - 1 && data.get(rightChildIndex) < data.get(parentIndex)) {
            minIndex = rightChildIndex;
        }

        if(minIndex != parentIndex) {
            swap(parentIndex, minIndex);
            downHeapify(minIndex);
        }


    }

    void print() {
        for(Integer i : data) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(5);
        heap.add(15);

        heap.print();
    }
 
}
