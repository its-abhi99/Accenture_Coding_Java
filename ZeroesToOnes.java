import java.util.Scanner;

public class ZeroesToOnes {

    public static int solve(int n, int[] A) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count % 2 == 0) {
                if (A[i] == 0) {
                    count++;
                }
            } else {
                if (A[i] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Input the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the size of the array
            int n = scanner.nextInt();
            
            // Initialize the array
            int[] A = new int[n];
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            
            // Call the solve method and print the result
            System.out.println(solve(n, A));
        }
    }
}
