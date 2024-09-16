import java.util.Scanner;

public class PasswordChecker {
    public static int checkPassword(String str) {
        int n = str.length();
        
        // At least 4 characters
        if (n < 4) return 0;
        
        // Starting character must not be a number
        if (Character.isDigit(str.charAt(0))) return 0;
        
        int cap = 0, nu = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            // Must not have space or slash (/)
            if (ch == ' ' || ch == '/') return 0;
            
            // Counting capital letters
            if (Character.isUpperCase(ch)) cap++;
            
            // Counting numeric digits
            else if (Character.isDigit(ch)) nu++;
        }
        
        // Returns 1 if there are > 0 numeric digits and capital letters
        return (cap > 0 && nu > 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        String s;
        try (Scanner scanner = new Scanner(System.in)) {
            s = scanner.nextLine();
        }
        
        System.out.println(checkPassword(s));
    }
}
