
import java.util.Scanner;

public class SumOfEevenOdd  {

    public static void solve(int n, int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) even += arr[i];
            else odd += arr[i];
        }

        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            solve(n, arr);
        }
    }
}

