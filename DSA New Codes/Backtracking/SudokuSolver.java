/*
 * Find position i.e., unassigned cell
 * If there is none : return true
 * For digits from 1 to 9
 *      if there is no conflict for digit at row, column then assign digit 
 *      to cell and recursively try to fill in the rest of grid
 *      if recursion is successfull : return true
 *      else : remove digit and try another
 */

public class SudokuSolver {

    static int board[][] = {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,0,9},
    };
    static int MAX_BOARD_SIZE = 9;

    static boolean solveIt(int row, int col) {

        // checking if columns are still available to fill
        if(col == MAX_BOARD_SIZE) {
            row = row + 1;
            col = 0;
        }

        // checking if still rows are remaining
        // base case reach to the end of board
        if(row == MAX_BOARD_SIZE) {
            display();
            return true;
        }

        // Check if cell is unassigned
        if(board[row][col] != 0) {
            return solveIt(row, col+1);
        }

        // if cell is empty then check for 9 possibilities
        for(int i = 1; i <= MAX_BOARD_SIZE; i++) {
            if(isOkToPlace(row, col, i)) {
                board[row][col] = i;
                boolean res = solveIt(row, col+1);
                // if result comes true it means we have reached to the board end
                if(res) {
                    return true;
                }
                // otherwise undo changes - Backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    // check if number is already present in a row
    static boolean isPresentInRow(int row, int data) {
        for(int col = 0; col < board.length; col++) {
            if(board[row][col] == data) {
                return true;
            }
        }
        return false;
    }

    // check if number is already present in a col
    static boolean isPresentInCol(int col, int data) {
        for(int row = 0; row < board.length; row++) {
            if(board[row][col] == data) {
                return true;
            }
        }
        return false;
    }
    // check if number is already present in that grid
    static boolean isPresentInGrid(int row, int col, int data) {
        int r = row - row % 3;
        int c = col - col % 3;
        for(int i = r; i < r + 3; i++) {
            for(int j = c; j < c + 3; j++) {
                if(board[i][j] == data) {
                    return true;
                }
            }
        }
        return false;
    }

    
    static boolean isOkToPlace(int row, int col, int data) {
        return !isPresentInCol(col, data) && !isPresentInRow(row, data) && !isPresentInGrid(row, col, data);
    }

    static void display() {
        for(int i = 0; i < MAX_BOARD_SIZE; i++) {
            for(int j = 0; j < MAX_BOARD_SIZE; j++) {
                System.out.print(board[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String result = solveIt(0,0) ? "Solved" : "Not Solved";
        System.out.println(result);
    }
}
