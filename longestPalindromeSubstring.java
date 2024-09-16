import java.util.Scanner;

public class longestPalindromeSubstring {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s; // If string length is 1 or less, it's already a palindrome

        int st = 0;           // Starting index of the longest palindromic substring
        int max_len = 1;      // Maximum length of the palindrome found

        // Check for odd-length palindromes
        for (int i = 0; i < n; i++) {
            int l = i, r = i; // Start with the same character at both ends (odd palindrome)

            // Expand while the characters are the same and within bounds
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            int len = r - l - 1; // Length of the current palindrome
            if (max_len < len) {
                max_len = len;
                st = l + 1; // Update starting index of the longest palindrome
            }
        }

        // Check for even-length palindromes
        for (int i = 0; i < n - 1; i++) {
            int l = i, r = i + 1; // Start with two consecutive characters (even palindrome)

            // Expand while the characters are the same and within bounds
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            int len = r - l - 1; // Length of the current palindrome
            if (max_len < len) {
                max_len = len;
                st = l + 1; // Update starting index of the longest palindrome
            }
        }

        // Return the longest palindromic substring
        return s.substring(st, st + max_len);
    }

    public static void main(String[] args) {
        // Taking input string
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input string
            System.out.println("Enter a string:");
            String str = scanner.nextLine();
            
            // Calling the longestPalindrome function and printing the result
            System.out.println(longestPalindrome(str));
        }
    }
}
