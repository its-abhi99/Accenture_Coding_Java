
import java.util.Scanner;

public class FootballTeamWinner {

    public static String solve(String s) {
        int A = 0, B = 0;

        for (int i = 4; i < s.length(); i += 6) {
            if (s.charAt(i) == 'A') {
                A++;
            } else {
                B++;
            }
        }
        return (A > B) ? "TeamA" : "TeamB";
    }
//Write input in this way e.g TeamA TeamB TeamA TeamA TeamB TeamA => SO WINNER is TeamA
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
            scanner.close();
        }
    }
}

