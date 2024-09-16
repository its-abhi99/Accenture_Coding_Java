import java.util.*;

public class ConsonantPermutationWithRepetition {

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    // Method to compute factorial of a number
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate permutations considering repetitions
    public static long calculatePermutationsWithRepetitions(Map<Character, Integer> freqMap, int consonantCount) {
        long denominator = 1;

        // Calculate the product of factorials of frequencies of repeated characters
        for (int freq : freqMap.values()) {
            denominator *= factorial(freq);
        }

        // Calculate and return the number of permutations
        return factorial(consonantCount) / denominator;
    }

    public static long findConsonantPermutations(String s) {
        Map<Character, Integer> consonantFreq = new HashMap<>();
        int consonantCount = 0;

        // Iterate through the string to count consonants and their frequencies
        for (char ch : s.toCharArray()) {
            if (!isVowel(ch) && Character.isLetter(ch)) {
                consonantFreq.put(ch, consonantFreq.getOrDefault(ch, 0) + 1);
                consonantCount++;
            }
        }

        // If no consonants are present, return 0
        if (consonantCount == 0) {
            return 0;
        }

        // Calculate permutations considering repetitions
        return calculatePermutationsWithRepetitions(consonantFreq, consonantCount);
    }

    public static void main(String[] args) {
        // Prompt the user for input
        try ( // Create a Scanner object for taking input from the user
                Scanner sc = new Scanner(System.in)) {
            // Prompt the user for input
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            // Find the number of consonant permutations
            long result = findConsonantPermutations(input);
            // Output the result
            System.out.println("Number of consonant permutations: " + result);
            // Close the scanner
        }
    }
}
