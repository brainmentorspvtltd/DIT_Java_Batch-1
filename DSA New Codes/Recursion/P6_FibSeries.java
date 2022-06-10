public class P6_FibSeries {

    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        // int first = fib(n-1);
        // int second = fib(n-2);
        // int result = first + second;
        // return result;
        return fib(n-1) + fib(n-2);

    }




    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }    
}
