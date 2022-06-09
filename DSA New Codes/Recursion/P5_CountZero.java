public class P5_CountZero {
    static int count(int n, int c) {
        if(n == 0) {
            return c;
        }
        if(n % 10 == 0) {
            c++;
        }
        n = n / 10;
        return count(n, c);
    }
    public static void main(String[] args) {
        int n = 12020050;
        int c = 0;
        count(n, c);
    }
}
