import java.util.*;

class ReplaceChInString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            char ch1 = sc.next().charAt(0);
            char ch2 = sc.next().charAt(0);
            System.out.print(replace(str, ch1, ch2));
        }
    }

    public static String replace(String str, char ch1, char ch2) {
        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ch1) {
                result.append(ch2);
            } else if (currentChar == ch2) {
                result.append(ch1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
