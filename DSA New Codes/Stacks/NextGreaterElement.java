import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    // Naive Solution
    static void nextGreater(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            int j;
            for(j = i+1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    System.out.print(arr[j] + ",");
                    break;
                }
            }
            if(j == n) {
                System.out.print(-1 + ",");
            }
        }
    }
    
    // Optimized Solution Using Stack
    static void nextGreater_2(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int s[] = new int[n];
        
        for(int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            s[i] = (st.empty()) ? -1 : st.peek();
            st.push(arr[i]);
        }
        // System.out.println(s);
        for(int i : s) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,10,15,8,9,12,6};
        int n = arr.length;
        nextGreater(arr, n);
        System.out.println();
        nextGreater_2(arr, n);
    }
}
