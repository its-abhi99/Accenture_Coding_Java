import java.util.*;

class HalloweenCandy {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Number of candy bags
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Candies in each bag
            }
            int h = sc.nextInt(); // Hours available
            System.out.println(solve(arr, h));
        }
    }

    public static int solve(int[] arr, int h) {
        int low = 1;
        int high = maxElement(arr);
        int result = high; // Initialize result with the maximum possible value

        while (low <= high) {
            int mid = (low + high) / 2;
            int requiredHours = 0; // Total hours required to distribute candies with size mid

            for (int candy : arr) {
                // Equivalent to Math.ceil((double)candy / mid) without floating-point arithmetic
                requiredHours += (candy + mid - 1) / mid;
            }

            if (requiredHours > h) {
                low = mid + 1; // Increase the size of candies since more hours are needed
            } else {
                result = mid; // Mid is a possible solution, try to find a smaller one
                high = mid - 1; // Search for a lesser value of c
            }
        }
        return result;
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int candy : arr) {
            max = Math.max(max, candy);
        }
        return max;
    }
}
