import java.util.*;

class HeightRebound {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int H = sc.nextInt();
            int Vi = sc.nextInt();
            int Vf = sc.nextInt();

            int en = Vi/Vf;
            int Hr = (int) Math.pow(en,2);

            System.out.print(H * Hr);
        }
    }
}
