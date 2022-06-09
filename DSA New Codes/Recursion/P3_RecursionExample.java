public class P3_RecursionExample {
    static void show(int n) {
        if(n <= 0) {
            return;
        }
        if(n % 2 != 0) {
            System.out.println(n);
        }
        show(n - 1);
        if(n % 2 == 0) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        // o/p : 7,5,3,1,2,4,6
        show(n);
    }
}
