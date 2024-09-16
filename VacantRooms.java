import java.util.*;
class VacantRooms {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int resRoomNum = sc.nextInt();
            int[] A = new int[resRoomNum];
            for(int i=0; i<resRoomNum; i++){
                A[i] = sc.nextInt();
            }
            int totalRoom = sc.nextInt();

            System.out.print(totalRoom - resRoomNum);
        }
    }
}
