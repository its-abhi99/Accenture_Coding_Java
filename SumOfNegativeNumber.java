import java.util.*;

class SumOfNegativeNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int sum =0;

            if(a < 0) sum += a;
            if(b < 0) sum += b;
            if(c < 0) sum += c;
            if(d < 0) sum += d;
            
            System.out.print(sum);
        }
    }
    
}
