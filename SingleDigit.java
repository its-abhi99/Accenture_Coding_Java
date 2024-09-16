import java.util.Scanner;

class SingleDigit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(MakeItSingleDigit(n));
        }
    }
    public static int MakeItSingleDigit(int n){
        while(n >= 10){
            if(n % 2 != 0){
                n = n/2;
            }else{
                n = (n-2)/2;
            }
        }
        return n;
    }
}
