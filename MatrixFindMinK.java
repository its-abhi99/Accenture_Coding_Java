import java.util.Scanner;

public class MatrixFindMinK {
    // Function to find the minimum value of K
    public static int findMinimumK(int[][] mat) {
        int n = mat.length; // Size of the NxN matrix

        // Iterate through each index to check for the condition
        for (int k = 0; k < n; ++k) {
            boolean rowCheck = true, colCheck = true;

            // Check the K-th row excluding (k, k)
            for (int j = 0; j < n; ++j) {
                if (j != k && mat[k][j] != 0) {
                    rowCheck = false;
                    break;
                }
            }

            // Check the K-th column excluding (k, k)
            for (int i = 0; i < n; ++i) {
                if (i != k && mat[i][k] != 0) {
                    colCheck = false;
                    break;
                }
            }

            // If both row and column check pass, return the current K
            if (rowCheck && colCheck) {
                return k; // Return the first K that satisfies the condition
            }
        }

        return -1; // If no such K exists, return -1
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            // Find the minimum K
            int result = findMinimumK(matrix);
            
            System.out.println(result);
        }
    }
}
