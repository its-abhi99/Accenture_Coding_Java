import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int findLowestCoins(int[] coins, int cur, int amount, int[][] dp) {
        if (cur >= coins.length) return Integer.MAX_VALUE - 1;
        if (amount == 0) return 0;
        
        if (dp[cur][amount] != -1) return dp[cur][amount];
        
        int pick = Integer.MAX_VALUE - 1, notpick = Integer.MAX_VALUE - 1;
        
        if (coins[cur] <= amount) {
            pick = 1 + findLowestCoins(coins, cur, amount - coins[cur], dp);
        }
        
        notpick = findLowestCoins(coins, cur + 1, amount, dp);
        
        return dp[cur][amount] = Math.min(pick, notpick);
    }
    
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        
        // Initialize dp array with -1
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        int res = findLowestCoins(coins, 0, amount, dp);
        return (res == Integer.MAX_VALUE - 1) ? -1 : res;
    }

    public static void main(String[] args) {
        // Taking input for the number of coins
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input for the number of coins
            System.out.print("Enter the number of different coins: ");
            int n = scanner.nextInt();
            
            int[] coins = new int[n];
            System.out.println("Enter the coin denominations:");
            for (int i = 0; i < n; i++) {
                coins[i] = scanner.nextInt();
            }
            
            // Taking input for the amount
            System.out.print("Enter the amount: ");
            int amount = scanner.nextInt();
            
            Solution solution = new Solution();
            int result = solution.coinChange(coins, amount);
            System.out.println("Minimum coins required: " + result); // Output the result
        }
    }
}
