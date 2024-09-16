import java.util.Scanner;

class SuperiorArrayElement {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(FindNumberOfSuperiorElement(arr, n));
        }
    }
    public static int FindNumberOfSuperiorElement(int[] arr, int n){
        int count=0;
        int sup = Integer.MIN_VALUE;
        if(n > 0){
            for(int i=n-1; i>=0; i--){
                if(arr[i] > sup){
                    sup = arr[i];
                    count++;
                }
            }
        }
        return count;
    }
}
