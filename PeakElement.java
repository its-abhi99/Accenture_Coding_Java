import java.util.Scanner;

public class PeakElement {
    
    // Function to find the peak element in the array
    public static int solve(int n, int[] arr) {
        if (n == 0) return -1;
        if (n == 1) return arr[0];
        
        // Check if the first or last element is a peak
        if (arr[0] > arr[1]) return arr[0];
        if (arr[n - 1] > arr[n - 2]) return arr[n - 1];
        
        // Traverse the array and check for the peak element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) return arr[i];
        }
        
        // If no peak found, return -1
        return -1;
    }

    // Driver program
    public static void main(String[] args) {
        // Input: size of the array
        try (Scanner sc = new Scanner(System.in)) {
            // Input: size of the array
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            // Input: array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Call solve method and print the result
            System.out.println(solve(n, arr));
        }
    }
}
