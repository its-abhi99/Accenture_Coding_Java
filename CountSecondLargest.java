import java.util.Scanner;

public class CountSecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.println(countSecondLargest(arr));
        }
    }

    public static int countSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return 0; // If less than 2 elements, there can't be a second largest
        }

        int idx = n - 2;

        // Find the second largest element by skipping duplicates of the largest
        while (idx >= 0 && arr[idx] == arr[n - 1]) {
            idx--;
        }

        if (idx < 0) {
            return 0; // All elements are the same
        }

        // Count the occurrences of the second largest element
        int secondLargest = arr[idx];
        int count = 0;

        while (idx >= 0 && arr[idx] == secondLargest) {
            count++;
            idx--;
        }

        return count;
    }
}
