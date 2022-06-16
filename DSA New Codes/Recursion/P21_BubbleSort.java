public class P21_BubbleSort {
    void bubbleSort(int arr[], int first, int last) {
        if(last == 0) {
            return;
        }
        if(first == last) {
            bubbleSort(arr, 0, last - 1);
        }
        if(arr[first] > arr[first + 1]) {
            int temp = arr[first];
            arr[first] = arr[first + 1];
            arr[first + 1] = temp;
        }
        bubbleSort(arr, 0, arr.length - 1);
    }
    public static void main(String[] args) {
        
    }
}
