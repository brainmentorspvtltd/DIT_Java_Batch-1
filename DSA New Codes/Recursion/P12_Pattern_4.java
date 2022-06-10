public class P12_Pattern_4 {
    static int printChar(int noOfChars, int charAscii) {
        if(noOfChars == 0) {
            return charAscii;
        }
        System.out.print((char)(64+charAscii));    // Preprocessing Logic
        noOfChars = noOfChars - 1;      // Small Problem
        return printChar(noOfChars, charAscii+1);       // Recursion
    }
    static void printPattern(int rows, int currentRow, int current) {
        if(rows == 0){
            return;
        }
        current = printChar(currentRow, current);
        System.out.println();
        printPattern(rows-1, currentRow+1, current);
    }
    public static void main(String[] args) {
        printPattern(6, 1, 1);
    }
}
