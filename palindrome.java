import java.util.Scanner;

public class palindrome {

    // Function to check if the string is a palindrome
    public static String isPalindrome(String str) {
        int n = str.length();
        int i = 0;
        int j = n - 1;
        
        // Loop from both ends of the string
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return "false"; // Return false if characters don't match
            }
            i++;
            j--;
        }
        
        return "true"; // Return true if the string is a palindrome
    }

    public static void main(String[] args) {
        // Taking input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input from the user
            System.out.println("Enter a string:");
            String str = scanner.nextLine();
            
            // Calling the isPalindrome function and printing the result
            System.out.println(isPalindrome(str));
        }
    }
}
