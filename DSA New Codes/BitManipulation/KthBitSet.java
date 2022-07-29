public class KthBitSet {
    public static void main(String[] args) {
        int n = 8, k = 2;
        if((n & (1 << (k-1))) != 0) {
            System.out.println("Yes..");
        }
        else {
            System.out.println("No...");
        }
    }
}
