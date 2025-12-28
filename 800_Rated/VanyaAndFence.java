import java.util.*;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfFriends = scanner.nextInt();
        int heightOfFence = scanner.nextInt();
        int[] heights = new int[numOfFriends];
        for (int i = 0; i < numOfFriends; i++) {
            heights[i] = scanner.nextInt();
        }

        int result = minWidthRoad(numOfFriends, heightOfFence, heights);
        System.out.println(result);
    }

    public static int minWidthRoad(int n, int h, int[] arr) {
        int width = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > h) {
                width += 2;
            } else {
                width += 1;
            }
        }

        return width;
    }
}
