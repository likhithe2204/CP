import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int result = maxDominosPlaced(M, N);
        System.out.println(result);
    }

    public static int maxDominosPlaced(int M, int N) {
        return (M * N) / 2;
    }
}
