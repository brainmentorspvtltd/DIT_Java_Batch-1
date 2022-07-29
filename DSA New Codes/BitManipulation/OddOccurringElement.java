public class OddOccurringElement {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,4,3,2,2,5};
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        System.out.println("Result is : " + res);
    }
}
