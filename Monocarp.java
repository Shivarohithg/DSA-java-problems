import java.util.*;

public class Monocarp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];
            int countZero = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 0) {
                    countZero++;
                }
            }

            if (countZero < 2) {
                System.out.println(-1);
            } else {
                System.out.println(a[0] + a[n - 1]);
            }
        }

        sc.close();
    }
}