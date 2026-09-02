
import java.util.*;

public class Heapify {

    static int oddPart(int x) {

        while (x % 2 == 0) {
            x /= 2;
        }

        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            boolean possible = true;

            for (int i = 1; i <= n; i++) {

                int x = sc.nextInt();

                if (oddPart(i) != oddPart(x)) {
                    possible = false;
                }
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
    
}
