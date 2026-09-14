import java.util.*;

public class flipflop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Sort monsters from smallest to largest
            Arrays.sort(a);

            for (int i = 0; i < n; i++) {

                // Cannot kill this monster
                if (a[i] > c) {
                    break;
                }

                // Use as many flip-flops as possible
                long use = Math.min(k, c - a[i]);

                a[i] += use;
                k -= use;

                // Kill the monster
                c += a[i];
            }

            System.out.println(c);
        }

        sc.close();
    }
}