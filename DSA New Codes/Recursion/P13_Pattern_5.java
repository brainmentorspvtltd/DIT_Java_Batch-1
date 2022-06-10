public class P13_Pattern_5 {
    static void printSpace(int noOfSpaces) {
        if(noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpaces - 1);
    }
    static void printStar(int noOfStars) {
        if(noOfStars == 0) {
            return;
        }
        System.out.print("* ");    // Preprocessing Logic
        noOfStars = noOfStars - 1;      // Small Problem
        printStar(noOfStars);       // Recursion
    }
    static void printPattern(int rows, int currentRow) {
        if(rows == 0){
            return;
        }
        printSpace(rows-1);
        printStar(currentRow - rows + 1);
        System.out.println();
        printPattern(rows-1, currentRow);
    }
    public static void main(String[] args) {
        printPattern(6, 6);
    }
}
