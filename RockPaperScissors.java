import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Input the user's choice
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the user's choice
            String A = scanner.nextLine();
            
            // Determine and print the result
            switch (A) {
                case "rock" -> System.out.println("paper");
                case "paper" -> System.out.println("scissor");
                case "scissor" -> System.out.println("rock");
                default -> System.out.println("Invalid input");
            }
        }
    }
}
