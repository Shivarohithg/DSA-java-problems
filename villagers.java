import java.util.*;

public class villagers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] g = new long[n];

            for (int i = 0; i < n; i++) {
                g[i] = sc.nextLong();
            }

            Arrays.sort(g);

            long ans = 0;

            for (int i = n - 1; i >= 0; i -= 2) {
                ans += g[i];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}