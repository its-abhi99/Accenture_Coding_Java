import java.util.Scanner;

public class RegionsOnPlane {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(MaxNumOfRegions(n));
        }
    }
    public static int MaxNumOfRegions(int n){
        return (n * (n+1))/2 + 1;
    }
}
