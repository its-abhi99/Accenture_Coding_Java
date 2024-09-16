
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class File_X_ValidOrNo {

    public static int solve(int n, List<String> arr) {
        int maxVer = -1;

        for (int i = 0; i < n; i++) {
            String s = arr.get(i);

            if (s.length() >= 6 && s.startsWith("File_")) {
                int idx = 5, ver = 0;
                boolean valid = true;

                while (idx < s.length()) {
                    char ch = s.charAt(idx);
                    if (ch >= '0' && ch <= '9') {
                        ver = ver * 10 + (ch - '0');
                    } else {
                        valid = false; // Invalid
                        break;
                    }
                    idx++;
                }

                if (valid) maxVer = Math.max(maxVer, ver);
            }
        }
        return maxVer;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline
            
            List<String> arr = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextLine());
            }
            
            System.out.println(solve(n, arr));
        }
    }
}

