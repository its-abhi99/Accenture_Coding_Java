import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sieveOfEratosthenes(n);
        }
    }

    public static void sieveOfEratosthenes(int n) {
        // Create a boolean array and initialize all entries as true
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true); // Fill the array with true values
        primes[0] = primes[1] = false; // 0 and 1 are not prime numbers

        // Start with the first prime number, which is 2
        for (int p = 2; p * p <= n; ++p) {
            // If primes[p] is still true, then it is a prime number
            if (primes[p]) {
                // Mark all multiples of p as false (not prime)
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        // Print all prime numbers
        for (int p = 2; p <= n; ++p) {
            if (primes[p]) {
                System.out.print(p + " ");
            }
        }
    }
}
