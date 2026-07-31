
import java.util.*;



public class Inversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            boolean same = true;
            int onesA = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                onesA += a[i];
            }

            int onesToZero = 0;
            int zerosInB = 0;

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();

                if (a[i] != b)
                    same = false;

                if (b == 0)
                    zerosInB++;

                if (a[i] == 1 && b == 0)
                    onesToZero++;
            }

            if (same) {
                System.out.println(0);
            } else if (onesA == 0) {
                System.out.println(-1);
            } else if (zerosInB == 0) {
                System.out.println(-1);
            } else if (onesToZero % 2 == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
    

