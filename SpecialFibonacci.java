import java.util.Scanner;

public class SpecialFibonacci {
    
    public static int solve(int n) {
        int a = 1;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int c = (a * a + b * b) % 47;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            System.out.println(solve(n));
        }
    }
}
