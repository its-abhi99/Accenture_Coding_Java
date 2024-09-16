import java.util.Scanner;

public class RemoveVowelsbtwCons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String solve(String s) {
        int n = s.length();
        if (n < 2) return s; // Edge case: if string length is less than 2, return it as is.

        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0)); // Add the first character to the result

        for (int i = 1; i < n - 1; i++) {
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {
                continue;
            } else {
                ans.append(s.charAt(i));
            }
        }
        ans.append(s.charAt(n - 1)); // Add the last character to the result

        return ans.toString();
    }
}
