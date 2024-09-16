import java.util.Scanner;

public class SumPrimeNumTillN {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(Sum(n));
        }
    }
    public static int Sum(int n){
        if(n < 2){
            return 0;
        }
        int sum = 0;
        for (int i=2; i<=n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPrime(int N){
        for(int i=2; i<=(int) Math.sqrt(N); i++){
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
