import java.util.Scanner;

public class FindKSubstring {

    public static String solve(String s, int k) {
        int n = s.length();
        int count = 0;
        int i;
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // Input string
        try (Scanner scanner = new Scanner(System.in)) {
            // Input string
            String s = scanner.nextLine();
            
            // Input value of k
            int k = scanner.nextInt();
            
            // Call the solve method and print the result
            System.out.println(solve(s, k));
        }
    }
}
