import java.util.Scanner;

public class CoconutSweetEat {

    public static int solve(int n, int e, int d) {
        if (n == 0) return -1;
        if (e == 0 || d == 0) return 0;
        if (d < 7) return ((d * e) % n == 0) ? d * e / n : d * e / n + 1;
        if (n * 6 < e * 7) return -1;

        int ans = 0;

        // Complete weeks
        int weeks = d / 7;
        ans += ((weeks * e * 7) % n == 0) ? ((weeks * e * 7) / n) : ((weeks * e * 7) / n) + 1;

        int left = ans * n - weeks * e * 7;

        // Remaining days
        int days = d % 7;
        int req = (days * e - left);

        ans += (req % n == 0) ? (req / n) : (req / n) + 1;
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int e = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println(solve(n, e, d));
        }
    }
}
