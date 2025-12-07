import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int result = countMoves(mat, 5, 5);
        System.out.println(result);
    }

    public static int countMoves(int[][] mat, int n, int m) {
        // Step1 : Find the co-ordinates of the cell where 1 is lying.
        // Step2 : Take the co-ordinates and subtract from (3, 3) co-ordinate
        // Step3 : Pick the obtained sum & return

        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                    break;
                }
            }
        }
        return Math.abs(Math.abs(row - 3) + Math.abs(col - 3));
    }
}
