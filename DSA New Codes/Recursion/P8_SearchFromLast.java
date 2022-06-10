public class P8_SearchFromLast {
    static int searchLast(int arr[], int index, int search) {
        if(arr.length - 1 == index) {
            return -1;
        }
        int lastIndex = searchLast(arr, index+1, search);
        if(lastIndex == -1) {
            if(arr[index] == search) {
                return index;
            }
            else {
                return -1;
            }
        }
        else {
            // if lastindex != -1
            return lastIndex;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,11,4,6};
        int index = 0;
        int search = 11;
        searchLast(arr, index, search);
    } 
}
