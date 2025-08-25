public class RatMaze {
    static int N;

    // Function to print the solution matrix
    void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if x, y is a valid move
    boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    // Function to solve the maze
    Boolean solveMaze(int maze[][]) {
        int sol[][] = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // Utility function to solve the maze using backtracking
    boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // If the destination is reached
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is a valid move
        if (isSafe(maze, x, y)) {
            // Mark x, y as part of the solution path
            sol[x][y] = 1;

            // Move forward in the x direction
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            // Move downward in the y direction
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            // Move backward in the x direction
            if (solveMazeUtil(maze, x - 1, y, sol)) {
                return true;
            }

            // Move upward in the y direction
            if (solveMazeUtil(maze, x, y - 1, sol)) {
                return true;
            }

            // Backtrack: Unmark x, y as part of the solution path
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Main function to test the code
    public static void main(String args[]) {
        RatMaze m = new RatMaze();

        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        N = maze.length; // Set the maze size
        m.solveMaze(maze);
    }
}
