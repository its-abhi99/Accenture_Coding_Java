import java.util.*;
class SecondSmallest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            if(n < 2){
                System.out.print("invalid");
            }
            System.out.print(SecondSmall(arr, n));
        }
    }
    public static int SecondSmall(int[] arr, int n){
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmallest && arr[i] != smallest){
                secSmallest = arr[i];
            }
        }
        if (secSmallest == Integer.MAX_VALUE){
            return -1;
        }
        return secSmallest;
    }
}
