import java.util.*;

public class CountPalindromicSubsequence {
    // Function to count all palindromic subsequences
    public static int solve(String str, int i, int j, int[][] dp) {
        // Base case: A single character is always a palindrome
        if (i == j) {
            return 1;
        }

        // Base case: If i exceeds j, there's no subsequence
        if (i > j) {
            return 0;
        }

        // If the value is already computed, return it from dp table
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // If the characters at positions i and j are the same
        if (str.charAt(i) == str.charAt(j)) {
            // Include both characters and recurse
            return dp[i][j] = 1 + solve(str, i + 1, j, dp) + solve(str, i, j - 1, dp);
        } else {
            // Exclude the mismatched characters and recurse
            return dp[i][j] = solve(str, i + 1, j, dp) + solve(str, i, j - 1, dp) - solve(str, i + 1, j - 1, dp);
        }

    }

    // Driver function
    public static void main(String[] args) {
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            str = sc.nextLine();
        }

        int n = str.length();
        int[][] dp = new int[n][n];  // Initialize the DP array

        // Initialize all entries of dp as -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Call the recursive function and print the result
        System.out.println(solve(str, 0, n - 1, dp));
    }
}
