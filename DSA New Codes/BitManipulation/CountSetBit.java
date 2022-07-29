public class CountSetBit {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;
        // TC : 0(Total bits in n)
        // while(n > 0) {
        //     if((n & 1) == 1) {
        //         result++;
        //     }
        //     n = n >> 1;
        // }

        // TC : 0(Set Bit Count)
        while(n > 0) {
            n = (n & (n-1));
            result++;
        }

        System.out.println("Result is : " + result);
    }
}
