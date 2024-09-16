import java.util.Scanner;

class Sum_of_odd_integers{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(SumOddIntegers(arr, n));
        }
    }
    public static int SumOddIntegers(int[] arr, int n){
        int sum=0;
        if(n > 0){
            for(int i=0; i<n; i++){
                if(arr[i] % 2 != 0){
                    sum = sum + arr[i];
                }
            }
        }
        return sum;
    }
}