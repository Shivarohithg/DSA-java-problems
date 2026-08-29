import java.util.*;

public class Main {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            long ans = 0;

            // evenStart = value at index 0
            // oddStart = value at index 1
            for (int evenStart = 0; evenStart <= 1; evenStart++) {
                for (int oddStart = 0; oddStart <= 1; oddStart++) {

                    boolean ok = true;

                    for (int i = 0; i < n; i++) {
                        int expected;

                        if (i % 2 == 0) {
                            expected = evenStart ^ ((i / 2) % 2);
                        } else {
                            expected = oddStart ^ (((i - 1) / 2) % 2);
                        }

                        if (s.charAt(i) != '?' &&
                            s.charAt(i) - '0' != expected) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) ans = (ans + 1) % MOD;
                }
            }

            System.out.println(ans);
        }
    }
}
