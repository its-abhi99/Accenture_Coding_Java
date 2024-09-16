import java.util.*;

public class DeleteAndEarn {
    public static int deleteAndEarn(int[] nums) {
        

        // Find the maximum element
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > mx) {
                mx = num;
            }
        }

        HashMap<Integer, Integer> val = new HashMap<>();
        
        for (int num : nums) {
            val.put(num, val.getOrDefault(num, 0) + num);
        }

        int pick = val.getOrDefault(1, 0);
        int notPick = 0;

        for (int i = 2; i <= mx; ++i) {
            int newPick = notPick + val.getOrDefault(i, 0);
            int newNotPick = Math.max(pick, notPick);
            notPick = newNotPick;
            pick = newPick;
        }
        
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            
            int result = deleteAndEarn(nums);
            System.out.println("The maximum points that can be earned: " + result);
        }
    }
}
