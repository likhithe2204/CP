import java.util.*;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRooms = scanner.nextInt();

        int[] numOfPeopleLiving = new int[numOfRooms];
        int[] roomsCapacity = new int[numOfRooms];
        
        for (int i = 0; i < numOfRooms; i++) {
            numOfPeopleLiving[i] = scanner.nextInt();
            roomsCapacity[i] = scanner.nextInt();
        }

        int vacantRooms = findRoomsForTwo(numOfRooms, numOfPeopleLiving, roomsCapacity);
        System.out.println(vacantRooms);
    }

    public static int findRoomsForTwo(int n, int[] p, int[] q) {
        int left = 0, right = 0, cnt = 0;

        while (left < p.length && right < q.length) {
            int vacant = Math.abs(p[left] - q[right]);
            if (vacant >= 2) cnt++;
            left++;
            right++;
        }

        return cnt;
    }
}
