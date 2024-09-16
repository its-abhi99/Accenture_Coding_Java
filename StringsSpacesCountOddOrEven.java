import java.util.Scanner;

public class StringsSpacesCountOddOrEven {

    public static String solve(String s1, String s2) {
        int A = 0, B = 0;

        // Count spaces in s1
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') A++;
        }

        // Count spaces in s2
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') B++;
        }

        int diff = Math.abs(A - B);
        
        // Return "Even" or "Odd" based on the difference
        return (diff % 2 == 0) ? "Even:" + diff : "Odd:" + diff;
    }

    public static void main(String[] args) {
        // Read the first string
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the first string
            String s1 = scanner.nextLine();
            
            // Read the second string
            String s2 = scanner.nextLine();
            
            // Output the result of the solve function
            System.out.println(solve(s1, s2));
        }
    }
}
