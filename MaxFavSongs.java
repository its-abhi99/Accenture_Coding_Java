import java.util.Scanner;

public class MaxFavSongs {

    public static void main(String[] args) {
        // Input the string and integer k
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the string and integer k
            String s = scanner.next();
            int k = scanner.nextInt();
            int n = s.length();
            int count = 0;
            int i = 0, j = -1;
            // Calculating for the first window of size k
            while (j < k - 1) {
                if (s.charAt(++j) == 'a') {
                    count++;
                }
            }  
            int maxi = count;
            // Sliding window approach
            while (j < n - 1) {
                if (s.charAt(i++) == 'a') {
                    count--;
                }
                if (s.charAt(++j) == 'a') {
                    count++;
                }
                maxi = Math.max(maxi, count);
            }   // Output the maximum number of 'a's
            System.out.println(maxi);
        }
    }
}
