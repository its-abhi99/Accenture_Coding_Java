import java.util.*;
class FloyydPattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            sc.nextLine();

            for(int i=1; i<=n; i++){
                for(int j=1; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
