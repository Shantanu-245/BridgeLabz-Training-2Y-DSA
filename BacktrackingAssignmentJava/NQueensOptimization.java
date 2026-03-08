
import java.util.*;

public class NQueensOptimization {

    static boolean[] column;
    static boolean[] diag1;
    static boolean[] diag2;

    static boolean solve(int[] board, int row, int n) {

        if (row == n) {
            printBoard(board, n);
            return true; // stop after first solution
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + n;
            int d2 = row + col;

            if (!column[col] && !diag1[d1] && !diag2[d2]) {

                board[row] = col;
                column[col] = true;
                diag1[d1] = true;
                diag2[d2] = true;

                if (solve(board, row + 1, n))
                    return true;

                // backtrack
                board[row] = -1;
                column[col] = false;
                diag1[d1] = false;
                diag2[d2] = false;
            }
        }

        return false;
    }

    static void printBoard(int[] board, int n) {

        System.out.println("\nFirst Valid Solution:\n");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (board[i] == j)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter board size N (for N-Queens): ");
        int n = sc.nextInt();

        int[] board = new int[n];
        Arrays.fill(board, -1);

        column = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        boolean result = solve(board, 0, n);

        if (!result) {
            System.out.println("No solution exists.");
        }
    }
}
