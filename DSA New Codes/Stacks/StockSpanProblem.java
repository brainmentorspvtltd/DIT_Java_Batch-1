import java.util.Stack;

public class StockSpanProblem {
    static void calculate(int price[], int n, int s[]) {
        // span value for first day will always be 1
        s[0] = 1;
        for(int i = 1; i < n; i++) {
            s[i] = 1;
            // Traverse left while the next element on left is smaller then price
            for(int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--) {
                s[i]++;
            }
        }
        for(int i : s) {
            System.out.print(i + ",");
        }
    }

    static int[] calculateApproach_2(int price[], int n) {
        int s[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0] = 1;
        
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            s[i] = (st.empty()) ? (i+1) : (i - st.peek());
            st.push(i);
        }
        return s;
    }

    public static void main(String[] args) {
        int price[] = {10,4,5,90,120,80};
        int n = price.length;
        int S[] = new int[n];
        calculateApproach_2(price, n);
    }
}
