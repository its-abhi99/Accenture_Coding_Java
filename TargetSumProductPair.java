 
import java.util.*;

public class  TargetSumProductPair{

    public static void solve(int n, List<Integer> arr, int target) {
        List<Integer> ans = Arrays.asList(0, 0);
        int prod = 0;
        
        // Sort in descending order
        arr.sort((a, b) -> b - a);
        
        int st = 0, end = n - 1;
        while (st < end) {
            int sum = arr.get(st) + arr.get(end);
            
            if (sum == target) {
                if (prod < arr.get(st) * arr.get(end)) {
                    prod = arr.get(st) * arr.get(end);
                    ans.set(0, arr.get(st));
                    ans.set(1, arr.get(end));
                }
                st++;
                end--;
            } else if (sum < target) {
                end--;
            } else {
                st++;
            }
        }
        System.out.println(ans.get(0) + " " + ans.get(1));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            int target = scanner.nextInt();
            solve(n, arr, target);
        }
    }
}


