import java.util.*;

public class TVshow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int[] cnt = new int[k];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                    cnt[i % k]++;
            }

            boolean ok = true;

            for (int i = 0; i < k; i++) {
                if (cnt[i] % 2 != 0) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}