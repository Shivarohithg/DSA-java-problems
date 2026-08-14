
import java.util.*;

public class Blocked {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            Integer[] a = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a, Collections.reverseOrder());

            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                if (a[i].equals(a[i + 1])) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
            } else {
                for (int x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
