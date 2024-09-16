import java.util.*;

//googly prime means if sum of digits of a number is prime number. e.g 43 = 4 + 3 = 7 (its googly prime)
public class GooglyPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print(isGooglyPrime(num));
        }
    }

    public static String isGooglyPrime(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if (isPrime(sum)) return "YES";

        return "NO";
    }

    public static boolean  isPrime(int N){
        if(N <=1){
            return false;
        }
        for(int i=2; i< (int) Math.sqrt(N); i++){
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
