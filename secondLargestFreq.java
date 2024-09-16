import java.util.*;

public class secondLargestFreq {
    public static int solve(int n, List<Integer> arr) {
        int lar = Integer.MIN_VALUE;
        int sLar = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > lar) {
                sLar = lar;
                lar = arr.get(i);
            } else if (arr.get(i) < lar && arr.get(i) > sLar) {
                sLar = arr.get(i);
            }
        }

        // Count occurrences of the second largest element
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == sLar) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            
            System.out.println(solve(n, arr));
        }
    }
}
