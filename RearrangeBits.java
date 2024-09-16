import java.util.Scanner;

public class RearrangeBits{
    public static void main(String[] args) {
        // Input the number
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number
            int n = scanner.nextInt();
            
            // Counting set bits
            int count = 0;
            int temp = n;
            
            // Count the number of 1 bits (set bits) in binary representation
            while (temp > 0) {
                count += (temp & 1);
                temp >>= 1;
            }
            
            // Calculating the result as 2^count - 1
            int ans = (int) Math.pow(2, count) - 1;
            
            // Printing the result
            System.out.println(ans);
        }
    }
}
