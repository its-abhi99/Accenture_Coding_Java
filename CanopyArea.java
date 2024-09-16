import java.util.*;

public class CanopyArea {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            
            // Calculating area of canopy
            float area = 3.14f * d * d;
            
            // Rounding off to the nearest integer
            if (area - (int) area <= 0.5) {
                System.out.println((int) area);
            } else {
                System.out.println((int) area + 1);
            }
        }
    }
}
