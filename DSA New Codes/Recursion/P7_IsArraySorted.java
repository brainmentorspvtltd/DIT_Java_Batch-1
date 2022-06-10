public class P7_IsArraySorted {
    static boolean isSorted(int arr[], int index) {
        if(arr.length-1 == index) {
            return true;
        }
        if(arr[index] > arr[index+1]) {
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,9};
        int index = 0;
        isSorted(arr, index);
    }
}
