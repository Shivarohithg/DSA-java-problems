import java.util.*;

public class Erasers {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long first = 0;
            long last = 0;

            for (int i = 0; i < n; i++) {

                long x = sc.nextLong();

                if (i == 0) {
                    first = x;
                }

                if (i == n - 1) {
                    last = x;
                }
            }

            System.out.println(gcd(first, last));
        }

        sc.close();
    }
}