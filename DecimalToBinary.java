import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            System.out.println(solve(N));
        }
    }

    public static String solve(int n) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.insert(0, (n % 2) == 0 ? "0" : "1");
            n = n / 2;
        }
        return ans.toString();
    }
}
