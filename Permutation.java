
import java.util.*;

public class Permutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] pos = new int[n + 1];

            // Store position of every element in p
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                pos[x] = i;
            }

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean possible = true;

            int lastPosition = -1;

            for (int i = 0; i < n; i++) {

                // Skip consecutive duplicates
                if (i > 0 && a[i] == a[i - 1]) {
                    continue;
                }

                // Position of current value in p
                int currentPosition = pos[a[i]];

                // It must come after the previous value
                if (currentPosition < lastPosition) {
                    possible = false;
                    break;
                }

                lastPosition = currentPosition;
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
    

