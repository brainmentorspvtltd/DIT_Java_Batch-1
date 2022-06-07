import java.util.Stack;

public class HistogramProblemOptimized {

    // static int getMaxArea(int arr[], int n) {
    //     Stack<Integer> st = new Stack<>();
    //     st.push(-1);
    //     int maxArea = 0;
    //     for(int i = 0; i < n; i++) {
    //         while(st.peek() != -1 && arr[st.peek()] >= arr[i]) {
    //             int rightMost = i;
    //             int topElement = st.pop();
    //             int leftMost = st.peek();

    //             maxArea = Math.max(maxArea, arr[topElement] * (rightMost - leftMost - 1));
    //         }
    //         st.push(i);
    //     }
    //     while(st.peek() != -1) {
    //         maxArea = Math.max(maxArea, arr[st.pop()] * (n - st.peek() - 1));
    //     }
    //     // System.out.println(maxArea);
    //     return maxArea;
    // }

    public static long getMaxArea(long arr[], long n) 
    {
        Stack<Long> st = new Stack<>();
        long x = -1;
        st.push(x);
        long maxArea = 0;
        for(int i = 0; i < n; i++) {
            while(st.peek() != x && arr[st.peek().intValue()] >= arr[i]) {
                long rightMost = i;
                long topElement = st.pop();
                long leftMost = st.peek();

                maxArea = Math.max(maxArea, arr[(int)topElement] * (rightMost - leftMost - 1));
            }
            st.push((long)i);
        }
        while(st.peek() != -1) {
            maxArea = Math.max(maxArea, arr[st.pop().intValue()] * (n - st.peek() - 1));
        }
        // System.out.println(maxArea);
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;
        int maxArea = getMaxArea(arr, n);
        System.out.println(maxArea);
    }
}
