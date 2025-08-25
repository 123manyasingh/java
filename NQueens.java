public class NQueens {

    // Utility function to print the solution
    static void printSolution(int board[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Utility function to check if a queen can be placed at board[row][col]
    static boolean isSafe(int board[][], int row, int col, int N) {
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Recursive function to solve the N-Queens problem
    static boolean solveNQueensUtil(int board[][], int row, int N) {
        // If all queens are placed, return true
        if (row >= N) {
            return true;
        }

        // Consider this row and try placing the queen in all columns one by one
        for (int col = 0; col < N; col++) {
            // Check if it's safe to place the queen in board[row][col]
            if (isSafe(board, row, col, N)) {
                // Place the queen in the current position
                board[row][col] = 1;

                // Recur to place the rest of the queens
                if (solveNQueensUtil(board, row + 1, N)) {
                    return true;
                }

                // If placing queen in board[row][col] doesn't lead to a solution,
                // backtrack by removing the queen
                board[row][col] = 0;
            }
        }

        // If the queen cannot be placed in any column in this row, return false
        return false;
    }

    // Function to solve the N-Queens problem
    static boolean solveNQueens(int N) {
        int[][] board = new int[N][N];

        // Call the utility function to solve the problem
        if (!solveNQueensUtil(board, 0, N)) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        // Print the solution if found
        printSolution(board, N);
        return true;
    }

    public static void main(String args[]) {
        int N = 10; // Change this value to solve for different N

        // Solve the N-Queens problem
        solveNQueens(N);
    }
}
