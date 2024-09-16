import java.util.Scanner;

public class MagicalNumber {

    public static int solve(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int zeroCount = 0;

            // Count number of 0 bits in binary representation of the number
            while (num > 0) {
                if (num % 2 == 0) {
                    zeroCount++;
                }
                num = num / 2;
            }

            // If the number of zero bits is odd, increment the count
            if (zeroCount % 2 == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Input the number n
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number n
            int n = scanner.nextInt();
            
            // Call the solve method and print the result
            System.out.println(solve(n));
        }
    }
}
