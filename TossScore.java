import java.util.*;

class TossScore {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            System.out.print(Score(s));
        }
    }
    public static int Score(String s){
        int n = s.length();
        int score = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            switch (ch) {
                case 'H' -> {
                    score += 2;
                    count++;
                    if(count == 3){
                        return score;
                    }
                }
                case 'T' -> {
                    score -= 1;
                    count--;
                }
                default -> {
                    return 0;
                }
            }
        }
        return score;
    }
}
