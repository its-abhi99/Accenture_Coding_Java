import java.util.Scanner;

public class DivisibleBy2and3and6Average {
    public static void main(String[] args) {
        // Read the number of integers
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the number of integers
            int n = scanner.nextInt();
            
            int sum = 0;
            int count = 0;
            
            // Array to store the integers
            int[] arr = new int[n];
            
            // Read the integers into the array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Calculate the sum and count of numbers divisible by 6
            for (int i = 0; i < n; i++) {
                if (arr[i] % 6 == 0) {
                    sum += arr[i];
                    count++;
                }
            }
            
            // Calculate and print the average
            if (count > 0) {
                System.out.println(sum / count);
            } else {
                System.out.println(0); // No numbers divisible by 6
            }
        }
    }
}
