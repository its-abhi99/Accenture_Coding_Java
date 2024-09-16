import java.util.*;

class OperationOnBinaryString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input: Binary string containing digits and operators
            String str = sc.nextLine();
            System.out.println(OperationBinaryString(str));
        }
    }

    // Method to perform operations on the binary string
    public static int OperationBinaryString(String str) {
        int n = str.length();
        
        // Return -1 if the string is empty
        if (n == 0) {
            return -1;
        }

        // The first character is treated as the initial binary value
        int ans = str.charAt(0) - '0'; // Convert character '0' or '1' to its int value
        
        // Traverse the string, stepping through operators and binary digits
        for (int i = 1; i < n - 1; i += 2) {
            char op = str.charAt(i);   // Get the operator (A, B, C)
            int b = str.charAt(i + 1) - '0'; // Get the next binary digit and convert to int
            // Apply the respective operation
            switch (op) {
                case 'A' -> ans &= b;  // AND operation
                case 'B' -> ans |= b;  // OR operation
                case 'C' -> ans ^= b;  // XOR operation
                default -> {
                }
            }
        }
        
        // Return the final result after all operations
        return ans;
    }
}
