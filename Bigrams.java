import java.util.*;

public class Bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int countTwo = 0;
            boolean ok = false;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();

                if (x > 2)
                    ok = true;

                if (x == 2)
                    countTwo++;
            }

            if (ok || countTwo > 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}