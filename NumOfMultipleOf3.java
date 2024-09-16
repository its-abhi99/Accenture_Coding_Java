import java.util.Scanner;

public class NumOfMultipleOf3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            
            // Input array elements
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            
            int count = 0;
            
            // Count elements that are multiples of 3
            for (int i = 0; i < n; i++) {
                if (A[i] % 3 == 0) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
