import java.util.*;

class SumXOR {
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
        if(n==0)return 0;
        if(n==1)return arr[0];

        int sumEven = arr[0];
        int xorOdd = arr[1];

        for(int i=2; i<n; i++){
            if(i % 2 == 0) sumEven += arr[i];
            else xorOdd ^= arr[i];
        }
        return sumEven + xorOdd;
    }
}
