import java.util.Scanner;

class SnakeWaterGun {

    public static int solve(int n, String s) {
        String A = "";
        String B = "";
        String word = "";
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            word += s.charAt(i);

            if (word.equals("snake")) {
                if (flag) B += "s";
                else A += "s";
                flag = !flag;
                word = "";
            } else if (word.equals("water")) {
                if (flag) B += "w";
                else A += "w";
                flag = !flag;
                word = "";
            } else if (word.equals("gun")) {
                if (flag) B += "g";
                else A += "g";
                flag = !flag;
                word = "";
            }
        }

        // Print A and B strings (similar to `cout << A << endl << B << endl;` in C++)
        System.out.println(A);
        System.out.println(B);

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (B.charAt(i) == 's' && A.charAt(i) == 'g' ||
                B.charAt(i) == 'w' && A.charAt(i) == 's' ||
                B.charAt(i) == 'g' && A.charAt(i) == 'w') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            System.out.println(solve(n, s));
        }
    }
}
