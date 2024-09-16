import java.util.Scanner;

public class StringConcat {
    
    // Function to concatenate string 's' n times
    public static String solve(int n, String s) {
        StringBuilder ans = new StringBuilder(); // Using StringBuilder for efficiency
        
        // Append the string 'n' times
        while (n-- > 0) {
            ans.append(s);
        }
        
        return ans.toString(); // Convert StringBuilder to String
    }

    // Driver program
    public static void main(String[] args) {
        // Input: number of times to concatenate the string
        try (Scanner sc = new Scanner(System.in)) {
            // Input: number of times to concatenate the string
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline character after reading integer
            
            // Input: string to concatenate
            String s = sc.nextLine();
            
            // Call the solve method and print the result
            System.out.println(solve(n, s));
        }
    }
}
