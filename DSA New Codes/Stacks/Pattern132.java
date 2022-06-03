import java.util.Stack;

public class Pattern132 {
    boolean pattern_1(int []arr) {
        int n = arr.length;
        for(int i = 0; i < n-2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[k] > arr[i] && arr[j] > arr[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean pattern_2(int []arr) {
        int n = arr.length;
        int min = arr[0];
        for(int j = 1; j < n - 1; j++) {
            min = Math.min(min, arr[j]);
            if(min == arr[j]) {
                continue;
            }
            for(int k = j + 1; k < n; k++) {
                if(arr[k] < arr[j] && min < arr[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean pattern_3(int arr[]) {
        int n = arr.length;
        int min[] = new int[n];
        min[0] = arr[0];
        for(int j = 1; j < n; j++) {
            min[j] = Math.min(min[j-1], arr[j]);
        }
        Stack<Integer> st = new Stack<>();
        for(int j = n - 1; j >= 0; j--) {
            if(arr[j] > min[j]) {
                while(!st.isEmpty() && st.peek() <= min[j]) {
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() < arr[j]) {
                    return true;
                }
                st.push(arr[j]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // int arr[] = {3,1,4,2};
        int arr[] = {-1,3,2,0};
        pattern_2(arr);
        pattern_3(arr);
    }
}
