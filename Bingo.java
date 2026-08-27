import java.util.*;

public class Bingo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] count = new int[n * n + 1];

            int max = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int x = sc.nextInt();

                    count[x]++;

                    max = Math.max(max, count[x]);
                }
            }

            if (max > n * (n - 1)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}