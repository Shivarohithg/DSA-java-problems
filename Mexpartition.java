import java.util.*;
public class Mexpartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean[] present = new boolean[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x <= n) {
                    present[x] = true;
                }
            }

            int mex = 0;

            while (present[mex]) {
                mex++;
            }

            System.out.println(mex);
        }

        sc.close();
    }
}
    

