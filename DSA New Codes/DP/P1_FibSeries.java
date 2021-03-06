public class P1_FibSeries {
    static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int first = fib(n-1);
        int second = fib(n-2);
        int sum = first + second;
        return sum;
    }

    // Top Down
    static int fibMemoization(int n, int []cache) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(cache[n] != 0) {
            return cache[n];
        }

        int first = fib(n-1);
        int second = fib(n-2);
        int sum = first + second;
        cache[n] = sum;
        return cache[n];
    }

    // Bottom Up
    static int fibTabulation(int n) {
        int cache[] = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}