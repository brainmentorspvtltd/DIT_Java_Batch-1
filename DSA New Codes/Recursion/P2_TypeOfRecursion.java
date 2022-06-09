public class P2_TypeOfRecursion {
    static void show(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        show(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        show(n);
    }    
}
