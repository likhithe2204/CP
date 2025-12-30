import java.util.*;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMagnets = scanner.nextInt();
        String[] magnetPoles = new String[numOfMagnets];
        for (int i = 0; i < numOfMagnets; i++) {
            magnetPoles[i] = scanner.next();
        }

        int result = cntMagnetGroups(numOfMagnets, magnetPoles);
        System.out.println(result);
    }

    public static int cntMagnetGroups(int n, String[] poles) {
        int cnt = 1;    // first magent always forms a group

        for (int i = 0; i < n - 1; i++) {
            String first = poles[i];
            String next = poles[i + 1];

            if (first.charAt(1) == next.charAt(0)) {
                cnt++;  // new group formed
            }
        }

        return cnt;
    }
}
