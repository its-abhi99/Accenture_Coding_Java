import java.util.*;

class CountSetBitsOfNum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();

            int count=0;
            while(num > 0){
                count += num & 1;
                num = num >> 1;
            }
            System.out.print(count);
        }
    }
}
