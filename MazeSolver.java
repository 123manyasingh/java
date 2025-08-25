import java.util.*;

public class MazeSolver {
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

    public static boolean solveMaze(int[][] maze, int[][] solution, int x, int y) {
        int n = maze.length;

        // If we reach the goal
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        // Check if current position is safe to move
        if (isSafe(maze, x, y)) {
            // Mark as part of the solution path
            solution[x][y] = 1;

            // Try all possible directions
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (solveMaze(maze, solution, newX, newY)) {
                    return true;
                }
            }

            // Backtrack: Unmark this cell
            solution[x][y] = 0;
        }

        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = maze.length;
        int[][] solution = new int[n][n]; // To store the solution path

        if (solveMaze(maze, solution, 0, 0)) {
            System.out.println("Solution Path:");
            for (int[] row : solution) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}
