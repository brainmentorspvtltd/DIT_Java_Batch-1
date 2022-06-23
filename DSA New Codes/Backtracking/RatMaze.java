public class RatMaze {
    // Size of the maze
    static int N;
    
    // Display the solution
    void printSolution(int sol[][]) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + ",");
            }
            System.out.println();
        }
    }

    // checking the safe place for mouse to move
    boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    boolean solveMaze(int maze[][]) {
        int sol[][] = new int[N][N];
        if(!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution Doesn't Exists...");
            return false;
        }
        printSolution(sol);
        return true;
    }

    boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if(x == N-1 && y == N-1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // check if maze block is valid
        if(isSafe(maze, x, y)) {
            // check if block is already occupied in solution
            if (sol[x][y] == 1) {
                return false;
            }

            sol[x][y] = 1;

            // Move forward in x direction
            if(solveMazeUtil(maze, x+1, y, sol)) {
                return true;
            }

            // Move downward if x direction is not giving solution
            if(solveMazeUtil(maze, x, y+1, sol)) {
                return true;
            }

            // if moving in y direction doesn't give solution
            // then move backward in x direction
            if(solveMazeUtil(maze, x-1, y, sol)) {
                return true;
            }

            // if moving backward in x direction doesn't give solution
            // then move upward in y direction
            if(solveMazeUtil(maze, x, y-1, sol)) {
                return true;
            }

            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        N = maze.length;
        RatMaze obj = new RatMaze();
        obj.solveMaze(maze);
    }

}
