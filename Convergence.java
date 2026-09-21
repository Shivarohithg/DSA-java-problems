import java.util.*;

public class Convergence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int maxFreq = 1;
            int current = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    current++;
                } else {
                    maxFreq = Math.max(maxFreq, current);
                    current = 1;
                }
            }

            maxFreq = Math.max(maxFreq, current);

            int remaining = n - maxFreq;

            System.out.println((remaining + 1) / 2);
        }

        sc.close();
    }
}