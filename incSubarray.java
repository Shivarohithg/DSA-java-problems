import java.util.*;


public class incSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[m];

            for (int i = 0; i < m; i++)
                a[i] = sc.nextInt();

            boolean ok = true;

            for (int i = 1; i < m; i++) {
                if (a[i] != a[i - 1] + 1) {
                    ok = false;
                    break;
                }
            }

            if (!ok) {
                System.out.println(1);
            } else {
                System.out.println(n - a[m - 1] + 1);
            }
        }

        sc.close();
    }
}
    

