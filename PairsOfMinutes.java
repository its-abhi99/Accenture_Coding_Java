import java.util.HashMap;
import java.util.Scanner;

public class PairsOfMinutes {
    public static int countPairs(int[] arr) {
        // HashMap to store the frequency of remainders
        HashMap<Integer, Integer> remainderFrequency = new HashMap<>();
        int count = 0;

        // Iterate through each element in th'fc are array
        // Iterate through each element in the array
        for (int time : arr) {
            // Find the remainder when time is divided by 60
            int remainder = time % 60;
            // Find the complementary remainder that, when added, sums up to 60
            int complement = (60 - remainder) % 60;

            // If the complement exists in the map, add its frequency to count
            if (remainderFrequency.containsKey(complement)) {
                count += remainderFrequency.get(complement);
            }

            // Update the frequency of the current remainder in the map
            remainderFrequency.put(remainder, remainderFrequency.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Taking input for the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input for the size of the array
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            
            // Taking input for the elements of the array
            System.out.println("Enter the elements (minutes): ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            // Counting pairs that form a whole hour
            int numberOfPairs = countPairs(arr);
            System.out.println("Number of pairs that form a whole hour: " + numberOfPairs);
        }
    }
}
