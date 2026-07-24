import java.util.*;

public class project {

    static long ceilDiv(long a, long b) {
        return (a + b - 1) / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            long ans = ceilDiv(n, x + y);

            if (z * x <= n) {
                long remaining = n - z * x;
                long hours = z + ceilDiv(remaining, x + 10 * y);
                ans = Math.min(ans, hours);
            }

            System.out.println(ans);
        }
    }
}