import java.util.Stack;

public class PrevGreaterElement {
    // Naive Solution
    static void prevGreater(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            int j;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > arr[i]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
            if(j == -1) {
                System.out.println(-1);
            }
        }
    }

    // Optimized Solution Using Stack
    static void prevGreater_2(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.print(-1 + ",");
        
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            int greater = (st.empty()) ? -1 : st.peek();
            System.out.print(greater + ",");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,5,15,11,19,10};
        int n = arr.length;
        prevGreater_2(arr, n);
    }
}