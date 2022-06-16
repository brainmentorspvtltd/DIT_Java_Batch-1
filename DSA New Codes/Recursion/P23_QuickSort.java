public class P23_QuickSort {

    static void quickSort(int arr[], int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        int pivot =  arr[mid];
        int left = low;
        int right = high;
        while(left <= right) {
            while(arr[left] < pivot) {
                left++;
            }
            while(arr[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(arr, low, right); // small problem
        quickSort(arr, left, high); // small problem
    }

    public static void main(String[] args) {
        
    }
}
