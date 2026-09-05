
import java.util.*;

public class Prefiquence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int ones = 0;

            for (int i = 0; i < 2 * n; i++) {

                int x = sc.nextInt();

                if (x == 1) {
                    ones++;
                }
            }

            int zeros = 2 * n - ones;

            int minimum = ones % 2;
            int maximum = Math.min(ones, zeros);

            System.out.println(minimum + " " + maximum);
        }

        sc.close();
    }
}
    

