import java.util.*;

class LongestConsecutiveTempDrop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(largestConsecutiveDropCount(arr, n));
        }
    }
    public static int largestConsecutiveDropCount(int[] arr, int n){
        int count = 0;
        int maxCount = 0;

        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                count++;
            }else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
