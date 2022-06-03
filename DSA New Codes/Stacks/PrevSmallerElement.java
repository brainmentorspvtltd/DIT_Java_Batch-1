import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrevSmallerElement {
    static void prevSmaller(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        st.push(arr[0]);
        // System.out.print(-1 + ",");
        list.add(-1);
        
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            int greater = (st.empty()) ? -1 : st.peek();
            list.add(greater);
            System.out.print(greater + ",");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 2};
        int n = arr.length;
        prevSmaller(arr, n);
    }
}
