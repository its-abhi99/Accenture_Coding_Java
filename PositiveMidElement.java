import java.util.Scanner;

class PositiveMidElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print(findPositiveMid(arr, n));
        }
    }

    public static int findPositiveMid(int[] arr, int n) {
        // First pass: Count non-negative elements and determine mid index
        int size = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                size++;
            }
        }

        if (size == 0) {
            return -1; // No non-negative elements found
        }

        int midIndex = (size - 1) / 2;
        int count = 0;

        // Second pass: Find the mid positive element
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (count == midIndex) {
                    return arr[i];
                }
                count++;
            }
        }
        return -1; // In case no mid element is found, although this shouldn't happen
    }
}
