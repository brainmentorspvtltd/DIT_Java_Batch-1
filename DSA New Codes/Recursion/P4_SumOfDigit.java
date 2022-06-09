public class P4_SumOfDigit {
    static int sumOfDigit(int n, int sum) {
        if(n == 0){
            return sum;
        }
        sum += n % 10;
        n = n / 10;
        return sumOfDigit(n, sum);
    }
    public static void main(String[] args) {
        int n = 23211;
        int sum = 0;
        int op = sumOfDigit(n, sum);
        System.out.println(op);
    }
}
