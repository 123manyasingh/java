import java.util.ArrayList;
import java.util.Scanner;

public class josephus {
    public static int findSafePosition(int n, int k) {
        int safePosition = 0; // Base case: J(1, k) = 0 (0-based index)
        for (int i = 2; i <= n; i++) {
            safePosition = (safePosition + k) % i;
        }
        return safePosition + 1; // Convert to 1-based index
    }

    public static void main(String[] args) {
        int n = 13; // Total number of people
        int k = 2; // Step size
        System.out.println("The safe position is: " + findSafePosition(n, k));
    }
}

