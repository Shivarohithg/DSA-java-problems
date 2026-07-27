import java.util.*;

public class popcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = 0;

            for (int bit = 0; bit < 31; bit++) {
                long cost = 1L << bit;

                long take = Math.min(k, n / cost);

                ans += take;
                n -= take * cost;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}