public class P22_MergeTwoSortedArray {

    static int[] mergetSort(int arr_1[], int arr_2[]) {
        int arr[] = new int[arr_1.length + arr_2.length];
        int i = 0; // array_1 index
        int j = 0; // array_2 index
        int k = 0; // array_3 index

        // traverse the array_1 and array_2 and compare the values one by one
        // based on comparison put the elements in 3rd array
        while(i < arr_1.length && j < arr_2.length) {
            if(arr_1[i] <= arr_2[j]) {
                arr[k] = arr_1[i];
                i++;
                k++;
            }
            else {
                arr[k] = arr_2[i];
                j++;
                k++;
            }
        }

        // If array_1 is ended so pick all remaining values of array_2
        if(i == arr_1.length) {
            while(j < arr_2.length) {
                arr[k] = arr_2[j];
                j++;
                k++;
            }
        }

        // If array_2 is ended so pick all remaining values of array_1
        if(j == arr_2.length) {
            while(i < arr_1.length) {
                arr[k] = arr_2[i];
                i++;
                k++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr_1[] = {10,20,30,40,50};
        int arr_2[] = {5,15,19,22,23,33,70};
        int arr_3[] = mergetSort(arr_1, arr_2);
    }
}
