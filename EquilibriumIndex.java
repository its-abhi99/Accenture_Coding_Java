import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {
        // Input array size
        try (Scanner scanner = new Scanner(System.in)) {
            // Input array size
            int n = scanner.nextInt();
            int[] A = new int[n];
            int[] pre = new int[n];  // Prefix sum array
            int[] suf = new int[n];  // Suffix sum array
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            
            // Initialize prefix and suffix arrays
            pre[0] = A[0];
            suf[n - 1] = A[n - 1];
            
            
            for (int i = 1; i < n; i++) {
                pre[i] = A[i] + pre[i - 1]; // Fill prefix sum array
                suf[n-i-1] = A[n-i-1] + suf[n-i]; // Fill suffix sum array
            }
            
            
            // Find equilibrium index
            for (int i = 0; i < n; i++) {
                if (pre[i] == suf[i]) {
                    System.out.println(i);
                    scanner.close();
                    return;
                }
            }
            
            // If no equilibrium index found, print -1
            System.out.println(-1);
        }
    }
}
