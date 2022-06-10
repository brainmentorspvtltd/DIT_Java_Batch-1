public class P9_Pattern_1 {
    static void printStar(int noOfStars) {
        if(noOfStars == 0) {
            return;
        }
        System.out.print("*");    // Preprocessing Logic
        noOfStars = noOfStars - 1;      // Small Problem
        printStar(noOfStars);       // Recursion
    }
    static void printPattern(int rows, int currentRow) {
        if(rows == 0){
            return;
        }
        printStar(currentRow);
        System.out.println();
        printPattern(rows-1, currentRow+1);
    }
    public static void main(String[] args) {
        printPattern(6, 1);
    }
}
