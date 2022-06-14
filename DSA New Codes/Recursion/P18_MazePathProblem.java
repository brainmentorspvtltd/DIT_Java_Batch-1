import java.util.ArrayList;

public class P18_MazePathProblem {
    static ArrayList<String> getMazePath(int currentRow, int currentCol, int endRow, int endCol) {
        
        // Positive Base Case
        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // Negative Base Case
        if(currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        // Store and return results and make final result
        ArrayList<String> finalResult = new ArrayList<>();
        // Move one step horizontally, it means column + 1
        ArrayList<String> horizontalResult = getMazePath(currentRow, currentCol+1, endRow, endCol);
        for(String tempRes : horizontalResult) {
            finalResult.add("H" + tempRes);
        }

        // Move one step vertically, it means row + 1
        ArrayList<String> verticalResult = getMazePath(currentRow+1, currentCol, endRow, endCol);
        for(String tempRes : verticalResult) {
            finalResult.add("V" + tempRes);
        }

        return finalResult;

    }

    public static void main(String[] args) {
        ArrayList<String> res = getMazePath(0, 0, 2, 2);
        System.out.println(res);
    }
}
