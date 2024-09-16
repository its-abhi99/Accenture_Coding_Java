/*
A. Colorful Stones (Simplified Edition)
time limit per test2 seconds
memory limit per test256 megabytes

There is a sequence of colorful stones. The color of each stone is one of red, green, or blue. You are given a string s. The i-th (1-based) character of s represents the color of the i-th stone. If the character is "R", "G", or "B", the color of the corresponding stone is red, green, or blue, respectively.

Initially Squirrel Liss is standing on the first stone. You perform instructions one or more times.

Each instruction is one of the three types: "RED", "GREEN", or "BLUE". After an instruction c, if Liss is standing on a stone whose colors is c, Liss will move one stone forward, else she will not move.

You are given a string t. The number of instructions is equal to the length of t, and the i-th character of t represents the i-th instruction.

Calculate the final position of Liss (the number of the stone she is going to stand on in the end) after performing all the instructions, and print its 1-based position. It is guaranteed that Liss don't move out of the sequence.

Input
The input contains two lines. The first line contains the string s (1 ≤ |s| ≤ 50). The second line contains the string t (1 ≤ |t| ≤ 50). The characters of each string will be one of "R", "G", or "B". It is guaranteed that Liss don't move out of the sequence.

Output
Print the final 1-based position of Liss in a single line.

Examples
InputCopy
RGB
RRR
OutputCopy
2
InputCopy
RRRBGBRBBB
BBBRR
OutputCopy
3
InputCopy
BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB
BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB
OutputCopy
15
 */

import java.util.Scanner;

public class ColorfulStones {
    public static int solve(String s, String t) {
        int idx = 0;
        
        for (int i = 0; i < t.length(); i++) {
            if (idx < s.length() && t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
        }
        
        // Since we need to return the 1-based position, we add 1
        return idx + 1;
    }

    public static void main(String[] args) {
        // Taking input for s
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input for s
            System.out.print("Enter the sequence of stones (s): ");
            String s = scanner.nextLine();
            
            // Taking input for t
            System.out.print("Enter the sequence of instructions (t): ");
            String t = scanner.nextLine();
            
            // Calculating the final position
            int result = solve(s, t);
            
            // Printing the result
            System.out.println("The final 1-based position of Liss: " + result);
        }
    }
}
