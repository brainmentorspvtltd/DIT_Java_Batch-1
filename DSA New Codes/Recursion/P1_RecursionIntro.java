public class P1_RecursionIntro {

    static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        fact(n);
    }
}