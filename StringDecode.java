import java.util.Scanner;

// e.g 10111011 = ACB (it means A-1, B-11, C - 111)
public class StringDecode {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }

    public static String solve(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                ans.append((char) ('A' + count - 1));
                count = 0;
            }
        }
        // Append the last segment
        ans.append((char) ('A' + count - 1));
        
        return ans.toString();
    }
}
