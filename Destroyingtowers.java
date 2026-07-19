import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int mn = Integer.MAX_VALUE;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                mn = Math.min(mn, x);
                sum += mn;
            }

            System.out.println(sum);
        }
    }
}