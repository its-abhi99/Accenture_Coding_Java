import java.util.Scanner;

public class Hypotenuse {

    // Function to solve the problem, calculates the ceiling of the square root of (a^2 + b^2)
    public static int solve(int a, int b) {
        return (int) Math.ceil(Math.sqrt(a * a + b * b));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int a, b;
            while (n-- > 0) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(solve(a, b));
            }
        }
    }
}
