import java.util.*;

class EvenOddOperation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            System.out.print(Operation(num));
        }
    }
    public static int Operation(int num){
        if(num % 2 == 0){
            return DigitSum(num);
        }else{
            return ProductSum(num);
        }
    }
    public static int DigitSum(int num){
        int sum=0;
        while(num > 0){
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
    public static int ProductSum(int num){
        int pro=1;
        while(num > 0){
            pro *= num % 10;
            num = num/10;
        }
        return pro;
    }
}
