import java.util.*;

class SumValuesAtPrimeIndex {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(Sum(arr,n));
        }
    }
    public static int Sum(int[] arr, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(isPrime(i)){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int N){
        if( N <= 1){
            return false;
        }
        for(int i=2; i <= (int) Math.sqrt(N); i++){
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
