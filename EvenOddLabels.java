import java.util.*;

class EvenOddLabels {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            StringBuilder str = new StringBuilder();
            for(int i=0; i<n; i++){
                if(arr[i]%2==0){
                    str.append("even");
                }else{
                    str.append("odd");
                }
            }
            System.out.print(str.toString());
        }
    }
}
