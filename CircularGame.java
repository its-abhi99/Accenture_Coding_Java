import java.util.*; 
class CircularGame {
    public static int findTheWinner(int n, int k) {
        int winner = 0; // 0-based index

        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }

        // Convert from 0-based index to 1-based index
        return winner + 1;
    }

    public static void main(String[] args) {
        // Taking input for n
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input for n
            System.out.print("Enter the number of people (n): ");
            int n = scanner.nextInt();
            
            // Taking input for k
            System.out.print("Enter the counting step (k): ");
            int k = scanner.nextInt();
            
            // Calculating the winner
            int result = findTheWinner(n, k);
            
            // Printing the result
            System.out.println("The position of the last remaining person is: " + result);
            scanner.close();
        }
    }
}
