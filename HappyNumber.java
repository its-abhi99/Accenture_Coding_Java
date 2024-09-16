import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber{
    private static HashSet<Integer> set = new HashSet<>();
    
    public static boolean isHappy(int n) {
        System.out.println(n); // To display the sequence
        if (n == 1) return true;

        if (set.contains(n)) return false;
        set.add(n);
        int newNum = 0;

        while (n > 0) {
            int x = n % 10;
            newNum += (x * x);
            n /= 10;
        }

        return isHappy(newNum);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to check if it is a happy number: ");
            int n = scanner.nextInt();
            
            boolean result = isHappy(n);
            
            if (result) {
                System.out.println(n + " is a happy number.");
            } else {
                System.out.println(n + " is not a happy number.");
            }
        }
    }
}
