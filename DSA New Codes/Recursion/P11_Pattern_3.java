public class P11_Pattern_3 {
    static int printStar(int noOfStars, int digit) {
        if(noOfStars == 0) {
            return digit;
        }
        System.out.print(digit);    // Preprocessing Logic
        noOfStars = noOfStars - 1;      // Small Problem
        return printStar(noOfStars, digit+1);       // Recursion
    }
    static void printPattern(int rows, int currentRow, int startDigit) {
        if(rows == 0){
            return;
        }
        startDigit = printStar(currentRow, startDigit);
        System.out.println();
        printPattern(rows-1, currentRow+1, startDigit);
    }

    public static void main(String[] args) {
        int startDigit = 1;
        printPattern(6, 1, startDigit);
    }
}