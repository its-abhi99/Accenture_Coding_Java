import java.util.*;
class ClimbingStairs {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int stairNum = sc.nextInt();

            System.out.print(DistinctWaysToClimb(stairNum));
        }
    }
    public static int DistinctWaysToClimb(int stairNum){
        int pre1 = 1, pre2 = 1;

        for(int i=2; i<=stairNum; i++){
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
