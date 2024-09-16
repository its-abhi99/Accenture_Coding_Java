import java.util.*;

public class NthFibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(solve(n));
            sc.close();
        }
    }

    public static int solve(int n) {
        if (n == 0 || n == 1) return n;
        
        int pre1 = 1, pre2 = 0;
        
        for (int i = 2; i <= n; i++) {
            int curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }
}
