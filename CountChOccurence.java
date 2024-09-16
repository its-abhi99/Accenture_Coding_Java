import java.util.*;
class CountChOccurence {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            char ch = sc.next().charAt(0);

            int count=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            System.out.print(count);
        }
    }
}
