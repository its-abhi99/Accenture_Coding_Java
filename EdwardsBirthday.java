import java.util.Scanner;

class EdwardsBirthday {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.print(MaxNumOfPieces(n));
        }

    }
    public static int MaxNumOfPieces(int n){
        return (n * (n+1))/2 + 1;
    }
}
