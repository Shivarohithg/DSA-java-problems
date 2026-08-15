import java.util.*;

public class Rightmax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int max = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x >= max) {
                    ans++;
                    max = x;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}