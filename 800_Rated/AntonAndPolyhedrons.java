import java.util.*;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int result = countAllPolyhedronsFaces(n, names);
        System.out.println(result);
    }

    public static int countAllPolyhedronsFaces(int n, String[] names) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        for (int i = 0; i < n; i++) {
            String s = names[i];
            ans += map.get(s);
        }

        return ans;
    }
}
