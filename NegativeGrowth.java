import java.util.Scanner;

public class NegativeGrowth {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            
            int count = 0;
            
            if (n <= 1) {
                System.out.println(0);
                return;
            }
            
            // Count instances of negative growth
            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i + 1]) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
